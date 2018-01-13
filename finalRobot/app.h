#ifdef __cplusplus
extern "C" {
#endif

#pragma once

#include "ev3api.h"

#ifndef STACK_SIZE
#define	STACK_SIZE		4096
#endif

#ifndef TOPPERS_MACRO_ONLY

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <ctype.h>
#include <string.h>
#include <time.h>
#include "driver_interface_bluetooth.h"
#include "driver_interface_filesys.h"
#include "syssvc/serial.h"
#include <stdbool.h>


#define sleep tslp_tsk

#define ev3_print(x, s) ev3_lcd_draw_string(s, 0, x * FONT_HEIGHT)

#define ev3_lcd_clear() ev3_lcd_fill_rect(0, 0, EV3_LCD_WIDTH, EV3_LCD_HEIGHT, EV3_LCD_WHITE)
#define ev3_lcd_clear_line(x) ev3_lcd_fill_rect(0, x * FONT_HEIGHT, EV3_LCD_WIDTH, FONT_HEIGHT, EV3_LCD_WHITE)
#define ev3_lcd_clear_line_range(x, y) ev3_lcd_fill_rect(0, x * FONT_HEIGHT, EV3_LCD_WIDTH, (1 + y - x) * FONT_HEIGHT, EV3_LCD_WHITE)

/**
 * Default font
 */
extern int32_t FONT_WIDTH;
extern int32_t FONT_HEIGHT;

/**
 * Functions
 */

extern void missions();
extern void bt_task(intptr_t unused);
extern void btConnect();
extern bool_t isConnected();
extern void set_font(lcdfont_t font);
extern void init();
extern void read_sensors(int display_line);
extern void print_sensor_values(int start_line);
extern void close_app(intptr_t btn);
extern void cycle_print(char* message);
extern void moving(uint32_t speed_left, uint32_t speed_right);
extern void turn(bool direction, uint32_t speed);
extern bool detect_ultra_back();
extern colorid_t color_sensor_left();
extern colorid_t color_sensor_right();
extern void stay_on_board();
extern bool random_turn_direction();
extern void bumper_detection(int num);
extern void detect_lakes();
extern bool already_seen_color(colorid_t c);
extern void examinate_lake();
extern void get_values(char buffer[16]);
extern void avoid_obstacles();
extern void avoid_lakes();
extern void back_task(intptr_t unused);
extern void after_examinating_all_lakes();
extern void after_examinating_all_rocks();
extern bool color_found(colorid_t clr);
extern bool avoid_color(colorid_t clr);
extern void detect_rocks();
extern bool color_found_avoid(colorid_t color);
extern void push_obstacles();
/**
 * Tasks
 */

extern void	main_task(intptr_t);
extern void bt_task(intptr_t);
extern void stay_on_task(intptr_t unused);
extern void back_ultra_task(intptr_t unused);

#endif /* TOPPERS_MACRO_ONLY */

#ifdef __cplusplus
}
#endif
