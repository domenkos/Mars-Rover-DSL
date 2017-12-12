//MASTER

#include "app.h"

int32_t FONT_WIDTH, FONT_HEIGHT, NLINES;

// Speed settings
uint32_t
	DRIVE_SPEED = 30,
	SPECIAL_SPEED = 15;

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
const int ULTRASONIC_FRONT_DISTANCE = 40;
int added_lakes = 0;
colorid_t *seen_lakes;

int bumper_code = 0;


uint8_t slave_address[6] = { 0x00, 0x17, 0xE9, 0xB4, 0xCE, 0xE6 };
const char* pin = "0000";
static FILE *bt_con;
bool_t is_master = true;

int line = 0;



void main_task(intptr_t unused) {
	init();
    read_sensors(1);
    moving(DRIVE_SPEED, DRIVE_SPEED);
    while(true) {
		if (do_exit)
			break;
		read_sensors(1);
		sleep(100);
		missions();
	}
}

void missions()
{
	stay_on_board();
	avoid_obsticles();
	//detect_lakes();
}


void bt_task(intptr_t unused)
{
	static char buf[16];
	while (fgets(buf, 16, bt_con)) {

		get_values(buf);
		/*
		if(strcmp(buf, "1\n") == 0)

			ev3_led_set_color(LED_GREEN);
		else if (strcmp(buf,"0\n") == 0)
			ev3_led_set_color(LED_RED);
		else
			ev3_led_set_color(LED_OFF);
			*/
		//cycle_print(buf);
		dly_tsk(500);
	}
}

void get_values(char buffer[16])
{
	//buffer = "3;44;3";
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
		cycle_print(pom);

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
	ev3_motor_config(SMALL_ARM, UNREGULATED_MOTOR);
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
	if(direction) // turn right
	{
		moving(-(speed / 2), -speed);
	}
	else
	{
		moving(-speed, -(speed / 2));
	}
	sleep(500);
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
	if(l == COLOR_WHITE)
	{
		turn(true,SPECIAL_SPEED);
	}
	if(r == COLOR_WHITE)
	{
		turn(false, SPECIAL_SPEED);
	}
	if(ultrasonic_back > 3)
	{
		moving(DRIVE_SPEED, DRIVE_SPEED);
	}

}

void bumper_detection(int num)
{
	switch(num)
	{
	case 0: break;
	case 1: turn(true, SPECIAL_SPEED); break;
	case 2: turn(false, SPECIAL_SPEED); break;
	case 3: turn(random_turn_direction(), SPECIAL_SPEED); break;
	default: break;

	}
}

bool random_turn_direction()
{
	/*
	srand(time(NULL));
	int r = rand() % 2;
	*/
	return true;

}

void detect_lakes()
{
	colorid_t detected_color = color_mid; //dobiva iz druzga bricka
	if(detected_color == COLOR_RED || detected_color == COLOR_BLUE || detected_color == COLOR_YELLOW) // in dsl
	{
		if(already_seen_color(detected_color))
		{
			turn(random_turn_direction(),SPECIAL_SPEED);
		}
		else
		{
			seen_lakes[added_lakes++] = detected_color;
			// pomoc ga v jezero za DSL definicijo sekund
			examinate_lake();
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
	ev3_motor_stop(LEFT_P, true);
	ev3_motor_stop(RIGHT_P, true);
	//poskavanga z palcko
	//magija
	ev3_motor_set_power(SMALL_ARM, DRIVE_SPEED / 2 );
	sleep(2000);
	ev3_motor_stop(SMALL_ARM, true);
	sleep(5000);
	//konec magije
	turn(random_turn_direction(), DRIVE_SPEED);
}

void avoid_obsticles()
{
	bumper_detection(bumper_code);
	if(ultrasonic_front < ULTRASONIC_FRONT_DISTANCE)
	{
		turn(random_turn_direction(), DRIVE_SPEED);
	}
}
