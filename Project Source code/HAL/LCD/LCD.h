/*
 * File Name: LCD.h
 * Creation Date: 07/23/2020
 * Author: Rehab
 * Description: Header File for LCD...
 */ 

#ifndef __LCD__
#define __LCD__

//FILES INCLUDING
#include "BIT_MATH.h"
#include "DIO.h"
#include "LCD_Config.h"

//RW PIN
#define WRITE 	BIT_LOW
#define READ 	BIT_HIGH

//RS PIN
#define IR 		BIT_LOW
#define DR 		BIT_HIGH


//FUNCTIONS PROTOTYPES
uint8_t LCD_Init(void);
uint8_t LCD_SendCommand(uint8_t Cmd);
uint8_t LCD_SendData(uint8_t Data);
uint8_t LCD_SendString(ptr_uint8_t String);
uint8_t LCD_SendNumber(unsigned int Number);
#endif