//SLAVE

#include "app.h"

int32_t FONT_WIDTH, FONT_HEIGHT, NLINES;

/**
 * Brick 2 sensor
 * */
// Sensor mapping
sensor_port_t
  COLOR_MID = EV3_PORT_2,
  BUMPER_LEFT = EV3_PORT_1,
  BUMPER_RIGHT = EV3_PORT_4,
  ULTRA_FRONT = EV3_PORT_3;


/*
 * Variables for reading sensor values
 * */
bool_t
	touch_left = false,
	touch_right = false,
	do_exit = false;

colorid_t
	color_mid  = COLOR_WHITE;

int16_t
	ultrasonic_front = 40;


const char* pin = "0000";
static FILE *bt_con;
bool_t is_master = false;

int line = 0;


void bt_task(intptr_t unused);
void btConnect();
bool_t isConnected();
void set_font(lcdfont_t font);
void init();
void read_sensors(int display_line);
void print_sensor_values(int start_line);
void close_app(intptr_t btn);
void cycle_print(char* message);
unsigned int detect_bumpers();
void send_values();



void main_task(intptr_t unused) {
	init();
	while(true) {
		if (do_exit)
			break;
		read_sensors(1);
		send_values();
		dly_tsk(100);
	}
}

void bt_task(intptr_t unused)
{
	while(true)
	{
		read_sensors(1);
		send_values();
		dly_tsk(500);
	}
}

void btConnect() {
	while(true) {
		while (!ev3_bluetooth_is_connected()) {
			cycle_print((char*)"Waiting for connection...");
			sleep(1000);
		}
		bt_con = ev3_serial_open_file(EV3_SERIAL_BT);
		break;

        sleep(1000);
    }
    cycle_print((char*)"Connected.");
    //act_tsk(BT_TASK);
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
     * Brick 2 inicializations
    */

//	Sensor init
	ev3_sensor_config(COLOR_MID, COLOR_SENSOR);
	ev3_sensor_config(BUMPER_LEFT, TOUCH_SENSOR);
	ev3_sensor_config(BUMPER_RIGHT, TOUCH_SENSOR);
	ev3_sensor_config(ULTRA_FRONT, ULTRASONIC_SENSOR);

	//	Attach exit handler
	ev3_button_set_on_clicked(ENTER_BUTTON, close_app, ENTER_BUTTON);

}

void read_sensors(int display_line) {
	color_mid = ev3_color_sensor_get_color(COLOR_MID);
	ultrasonic_front = ev3_ultrasonic_sensor_get_distance(ULTRA_FRONT);
	touch_left = ev3_touch_sensor_is_pressed(BUMPER_LEFT);
	touch_right = ev3_touch_sensor_is_pressed(BUMPER_RIGHT);
}

void print_sensor_values(int start_line) {

}


void close_app(intptr_t btn) {
	do_exit = true;
	ev3_print(5, "Finishing..");
}

void cycle_print(char* message) {
    int printLine = ++line % NLINES;
    if (line >= NLINES)
        ev3_lcd_clear_line_range(printLine, printLine + 1);
    ev3_print(printLine, message);
}


unsigned int detect_bumpers()
{
	/*
	 * 0 - none
	 * 1 - left
	 * 2 - right
	 * 3 - both
	 * */

	unsigned int sum = 0;

	if(touch_left == 1) sum ++;
	if(touch_right == 1) sum += 2;

	return sum;
}

void send_values()
{
	fprintf(bt_con, "%d;%d;%d;\n", color_mid, ultrasonic_front, detect_bumpers());
	/*
	if(touch_left)
		fprintf(bt_con,"1\n");
	if(!touch_left)
		fprintf(bt_con,"0\n");
	*/
	char pom[30];
	sprintf(pom,"color %d\n",color_mid);
	sprintf(pom,"Distance FRONT: %d\n",ultrasonic_front);
	//cycle_print(pom);
}

