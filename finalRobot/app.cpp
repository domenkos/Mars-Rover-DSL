//MASTER

#include "app.h"

int32_t FONT_WIDTH, FONT_HEIGHT, NLINES;

// Speed settings
uint32_t
	DRIVE_SPEED = 20 ,
	SPECIAL_SPEED = 10;

/**
 * Brick 1 sensor and motor maping
 * */
// Sensor mapping
sensor_port_t
  COLOR_L = EV3_PORT_1,
  COLOR_R = EV3_PORT_4,
  ULTRA_B = EV3_PORT_2,
  GYRO	  = EV3_PORT_3;


// Motor mapping
motor_port_t
	LEFT_P    = EV3_PORT_A,
	RIGHT_P   = EV3_PORT_D,
	SMALL_ARM = EV3_PORT_C;



/*
 * Variables for reading sensor values
 * */
bool_t
	touch_left = false,
	touch_right = false,
	do_exit = false;

colorid_t
	color_left  = COLOR_WHITE,
	color_right = COLOR_WHITE,
	color_mid = COLOR_WHITE;

int16_t
	ultrasonic_back = 3,
	ultrasonic_front = 40;

const int NUM_OF_LAKES = 3;

const int ULTRASONIC_FRONT_DISTANCE = 25;
const int ULTRASONIC_FRONT_DISTANCE_ROCKS = 12;
const int NUMBER_OF_ROCKS = 2;


int added_lakes = 0;
int examined_rocks = 0;

colorid_t *seen_lakes;

int bumper_code = 0;


uint8_t slave_address[6] = { 0x00, 0x17, 0xE9, 0xB4, 0xCE, 0xE6 };
const char* pin = "0000";
static FILE *bt_con;
bool_t is_master = true;

int line = 0;

void main_task(intptr_t unused) {
	init();
    //read_sensors(1);
    moving(DRIVE_SPEED, DRIVE_SPEED);
    act_tsk(STAY_TASK);
    //act_tsk(BACK_TASK);
    while(true) {
		if (do_exit)
			break;
		dly_tsk(100);
		//sleep(100);
		missions();
	}
    ev3_motor_stop(LEFT_P,true);
    ev3_motor_stop(RIGHT_P,true);
}

void missions()
{
	avoid_lakes();
	push_obstacles();
	//avoid_obstacles();
	//detect_rocks();
	//detect_lakes();
}

void stay_on_task(intptr_t unused)
{
	while(true)
	{
		if(ultrasonic_back > 10)
		{
			ev3_led_set_color(LED_RED);
			moving(DRIVE_SPEED, DRIVE_SPEED);
			dly_tsk(500);
		}
		stay_on_board();
	}
}

void bt_task(intptr_t unused)
{
	static char buf[16];
	while (fgets(buf, 16, bt_con)) {
		get_values(buf);
		//cycle_print(buf);
		read_sensors(1);
		/*
		char pom[20];
		sprintf(pom,"distance front %d\n", ultrasonic_front);
		cycle_print(pom);

		if(strcmp(buf, "1\n") == 0)
			ev3_led_set_color(LED_GREEN);
		else if (strcmp(buf,"0\n") == 0)
			ev3_led_set_color(LED_RED);
		else
			ev3_led_set_color(LED_OFF);
			*/
		//cycle_print(buf);
		dly_tsk(100);
	}
}

void back_ultra_task(intptr_t unused){
	cycle_print((char *) "v tasku sm");
	char pom[20];
	while(true)
	{
		sprintf(pom,"distance back %d\n", ultrasonic_back);
		cycle_print(pom);
		if(ultrasonic_back > 10)
		{
			ev3_led_set_color(LED_RED);
			moving(DRIVE_SPEED, DRIVE_SPEED);
		}
	}
}


void get_values(char buffer[16])
{
	//buffer = "3;44;3;";
	char *p = buffer;
	char *pom = (char*) malloc(sizeof(char) * 16);
	int read_values[3];
	for(int i = 0; i < 3; i++)
	{
		int j = 0;
		while(*p != ';')
		{
			pom[j++] = *p;
			p++;
		}
		p++;
		int x = atoi(pom);
		read_values[i] = x;

		sprintf(pom,"%d --> %d\n", i,x);
		//cycle_print(pom);

		free(pom);
		pom = (char * ) malloc(sizeof(char) * 16);
	}
	color_mid = (colorid_t) read_values[0];
	ultrasonic_front = read_values[1];
	bumper_code = read_values[2];
	switch(read_values[2])
	{
	case 0: touch_left = false; touch_right = false; break;
	case 1: touch_left = true; touch_right = false; break;
	case 2: touch_left = false; touch_right = true; break;
	case 3: touch_left = true; touch_right = true; break;
	default: touch_left = false; touch_right = false; break;
	}

}

void btConnect() {
    while(true) {
        if (is_master) {
            bt_con = fdopen(SIO_PORT_SPP_MASTER_TEST_FILENO, "a+");
            if (bt_con != NULL) {
                setbuf(bt_con, NULL);
                while (!isConnected()) {
                    cycle_print((char*)"Connecting...");
                    spp_master_test_connect(slave_address, pin);
                    sleep(1000);
                }
                break;
            }
        }

        sleep(1000);
    }
    cycle_print((char*)"Connected.");
    act_tsk(BT_TASK);
    //act_tsk(BACK_TASK);
}

bool_t isConnected() {
    T_SERIAL_RPOR rpor;
    ER ercd = serial_ref_por(SIO_PORT_SPP_MASTER_TEST, &rpor);
    return ercd == E_OK;
}

void set_font(lcdfont_t font) {
    ev3_lcd_set_font(font);
    ev3_font_get_size(font, &FONT_WIDTH, &FONT_HEIGHT);
    NLINES = EV3_LCD_HEIGHT / FONT_HEIGHT;
}

void init() {
    set_font(EV3_FONT_SMALL);
    btConnect();
    /*
     * Brick 1 inicializations
    */
//	Motor init
	ev3_motor_config(LEFT_P, LARGE_MOTOR);
	ev3_motor_config(RIGHT_P, LARGE_MOTOR);
	ev3_motor_config(SMALL_ARM, MEDIUM_MOTOR);
//	Sensor init
	ev3_sensor_config(COLOR_R, COLOR_SENSOR);
	ev3_sensor_config(COLOR_L, COLOR_SENSOR);
	ev3_sensor_config(ULTRA_B, ULTRASONIC_SENSOR);
	ev3_sensor_config(GYRO,GYRO_SENSOR);
	//	Attach exit handler
	ev3_button_set_on_clicked(ENTER_BUTTON, close_app, ENTER_BUTTON);

	seen_lakes = (colorid_t *) malloc(sizeof(colorid_t) * NUM_OF_LAKES);
	for(int i = 0; i < NUM_OF_LAKES; i++)
	{
		seen_lakes[i] = COLOR_NONE;
	}

}

void read_sensors(int display_line) {
	color_left = ev3_color_sensor_get_color(COLOR_L);
	color_right = ev3_color_sensor_get_color(COLOR_R);
	ultrasonic_back = ev3_ultrasonic_sensor_get_distance(ULTRA_B);
}

void print_sensor_values(int start_line) {

}


void close_app(intptr_t btn) {
	do_exit = true;
	ev3_print(5, "Finishing..");

	ev3_motor_stop(LEFT_P, true);
	ev3_motor_stop(RIGHT_P, true);
	ev3_lcd_clear_line(5);
	ev3_print(5, "Finished!");
}

void cycle_print(char* message) {
    int printLine = ++line % NLINES;
    if (line >= NLINES)
        ev3_lcd_clear_line_range(printLine, printLine + 1);
    ev3_print(printLine, message);
}

void moving(uint32_t speed_left, uint32_t speed_right)
{
	ev3_motor_set_power(LEFT_P, speed_left);
	ev3_motor_set_power(RIGHT_P, speed_right);
}

void turn(bool direction, uint32_t speed)
{
	moving(-(speed/ 2), -(speed / 2));
	//sleep(500);
	dly_tsk(1000);
	if(direction) // turn right
	{
		moving((speed), -(speed / 2));
	}
	else
	{
		moving(-(speed / 2), (speed));
	}
	//sleep(500);
	dly_tsk(500);
	moving(DRIVE_SPEED, DRIVE_SPEED);
}

bool detect_ultra_back()
{
	if(ultrasonic_back > 3 /*razdalja od mize*/) // baje 3
	{
		return true; //padu je z mize
	}
	return false;
}


colorid_t color_sensor_left()
{
	return color_left;
}

colorid_t color_sensor_right()
{
	return color_right;
}

void stay_on_board()
{
	colorid_t l = color_sensor_left();
	colorid_t r = color_sensor_right();
	if(l == COLOR_WHITE && r == COLOR_WHITE)
	{
		moving(-(DRIVE_SPEED / 2), -(DRIVE_SPEED / 2));
		dly_tsk(1000);
		moving(2 * DRIVE_SPEED,-(2 * DRIVE_SPEED));
		dly_tsk(500);
		moving(DRIVE_SPEED, DRIVE_SPEED);
	}

	if(l == COLOR_WHITE)
	{
		turn(true,DRIVE_SPEED);
	}
	if(r == COLOR_WHITE)
	{
		turn(false, DRIVE_SPEED);
	}


}

void bumper_detection(int num)
{
	switch(num)
	{
	case 0: ev3_led_set_color(LED_OFF); break;
	case 1: turn(true, SPECIAL_SPEED); ev3_led_set_color(LED_ORANGE); break;
	case 2: turn(false, SPECIAL_SPEED); ev3_led_set_color(LED_RED); break;
	case 3: turn(random_turn_direction(), SPECIAL_SPEED); break;
	default: break;

	}
}

bool random_turn_direction()
{

	return (color_left + color_mid + color_right + (ultrasonic_front - 1) * 2) % 2 == 0;

}

void detect_lakes()
{
	colorid_t detected_color = color_mid; //dobiva iz druzga bricka
	if(color_found(detected_color))
	{
		if(already_seen_color(detected_color))
		{
			turn(random_turn_direction(),SPECIAL_SPEED);
			return;
		}
		else
		{
			seen_lakes[added_lakes++] = detected_color;
			// pomoc ga v jezero za DSL definicijo sekund
			examinate_lake();
			if(added_lakes == NUM_OF_LAKES)
				after_examinating_all_lakes();
			return;
		}
	}
	else if(color_found_avoid(detected_color)){
		turn(random_turn_direction(),SPECIAL_SPEED);
		return;
	}
	if(color_found(color_left))
	{
		if(already_seen_color(color_left))
		{
			turn(true, DRIVE_SPEED);
			return;
		}
		else
		{
			ev3_motor_set_power(LEFT_P, -20);
			ev3_motor_set_power(RIGHT_P, -10);
			dly_tsk(500);
			ev3_motor_set_power(LEFT_P, 10);
			ev3_motor_set_power(RIGHT_P, 10);
			dly_tsk(500);
			return;
		}

	}
	else if(color_found_avoid(color_left)){
		turn(false, DRIVE_SPEED);
		return;
	}
	if(color_found(color_right))
	{
		if(already_seen_color(color_right))
		{
			turn(false, DRIVE_SPEED);
			return;
		}
		else
		{
			ev3_motor_set_power(LEFT_P, -10);
			ev3_motor_set_power(RIGHT_P, -20);
			dly_tsk(500);
			ev3_motor_set_power(LEFT_P, 10);
			ev3_motor_set_power(RIGHT_P, 10);
			dly_tsk(500);
			return;
		}
	}
	else if(color_found_avoid(color_right)){
		{
			turn(true, DRIVE_SPEED);
			return;
		}
	}
}


bool already_seen_color(colorid_t c)
{
	for(int i = 0; i < NUM_OF_LAKES; i++)
	{
		if(seen_lakes[i] == c)
			return true;
	}
	return false;
}

void examinate_lake()
{
	//poskavanga z palcko
	moving(-DRIVE_SPEED, -DRIVE_SPEED);
	dly_tsk(350);
	ev3_motor_stop(LEFT_P, true);
	ev3_motor_stop(RIGHT_P, true);

	//magija
	ev3_motor_set_power(SMALL_ARM, -8);
	dly_tsk(1500);
	ev3_motor_stop(SMALL_ARM,true);
	dly_tsk(1200);
	ev3_motor_set_power(SMALL_ARM, 8);
	dly_tsk(1500);
	//konec magije
	turn(random_turn_direction(), DRIVE_SPEED);
}

void avoid_obstacles()
{
	bumper_detection(bumper_code);
	if(ultrasonic_front < ULTRASONIC_FRONT_DISTANCE)
	{

		char pom[20];
		sprintf(pom,"distance front %d\n", ultrasonic_front);
		cycle_print(pom);

		turn(random_turn_direction(), DRIVE_SPEED);
	}
}

void avoid_lakes()
{
	colorid_t detected_color = color_mid;
	if(color_found_avoid(detected_color))
	{
		turn(random_turn_direction(),DRIVE_SPEED);
	}
	else if(color_found_avoid(color_left))
	{
		turn(true, DRIVE_SPEED);
	}
	else if(color_found_avoid(color_right))
	{
		turn(false, DRIVE_SPEED);
	}
}

void after_examinating_all_lakes()
{
	do_exit = true;
	ev3_speaker_play_tone(2000,2000);
}
		
bool color_found(colorid_t color)
{
	return color == COLOR_GREEN || color == COLOR_BLUE || color == COLOR_RED;
}

bool color_found_avoid(colorid_t color)
{
	return color == COLOR_GREEN || color == COLOR_BLUE || color == COLOR_RED;
}

void push_obstacles(){
	if (ultrasonic_front < 7 && ultrasonic_front != 0) {
		int i = 0;
		moving(DRIVE_SPEED, DRIVE_SPEED);
		do{
			ev3_led_set_color(i++ % 2 == 0 ? LED_GREEN  : LED_ORANGE);
			dly_tsk(100);
		} while(color_left != COLOR_WHITE && color_right != COLOR_WHITE && color_mid != COLOR_WHITE);
	}
	ev3_led_set_color(LED_OFF);
}

void after_examinating_all_rocks()
{
	ev3_speaker_play_tone(2000,3000);
	cycle_print((char *) "odjebi naprej!");
}

void detect_rocks()
{
	if(ultrasonic_front < ULTRASONIC_FRONT_DISTANCE_ROCKS && ultrasonic_front != 0)
	{
		if(examined_rocks < NUMBER_OF_ROCKS)
		{
			moving(0,0);
			ev3_motor_set_power(SMALL_ARM, -5);
			dly_tsk(800);
			ev3_motor_stop(SMALL_ARM,true);
			dly_tsk(1200);
			ev3_motor_set_power(SMALL_ARM, 5);
			dly_tsk(800);

			turn(random_turn_direction(), DRIVE_SPEED);

			char pom[20];
			sprintf(pom,"distance front %d\n", ultrasonic_front);
			cycle_print(pom);
			examined_rocks ++;
		}
		if(examined_rocks == NUMBER_OF_ROCKS)
		{
			after_examinating_all_rocks();
		}
	}
}




