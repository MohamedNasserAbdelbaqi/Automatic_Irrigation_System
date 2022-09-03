/*
 * File Name: LCD_Config.c
 * Creation Date: 09/07/2020
 * Author: Rehab
 * Description: C File for LCD Configuration ...
 */ 
 
#include "LCD.h"

Str_LCDConfig_t gastr_LCDConfig[LCD_PINS_NUMBER] = {
														{PORT_A,1,OUTPUT_PIN},
														{PORT_A,2,OUTPUT_PIN},
														{PORT_A,3,OUTPUT_PIN},
														{PORT_A,4,OUTPUT_PIN},
														{PORT_A,5,OUTPUT_PIN},
														{PORT_A,6,OUTPUT_PIN},
														{PORT_A,7,OUTPUT_PIN}
													};