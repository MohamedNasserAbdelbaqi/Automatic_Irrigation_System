/*
 * RELAY.c
 * Created: 11/26/2021 11:21:03 pm
 * Author: Mohamed Nasser
 */ 
 
#include "RELAY.h"

/* APIs for relay module */
error_state_t RELAY_Init(uint8_t port_name,uint8_t bit_number)
{
	return DIO_SetPinDirection(port_name,bit_number,OUTPUT_PIN);
}
error_state_t RELAY_TurnOn(uint8_t port_name,uint8_t bit_number)
{
	return DIO_WritePin(port_name,bit_number,BIT_HIGH);
}
error_state_t RELAY_TurnOff(uint8_t port_name,uint8_t bit_number)
{
	return DIO_WritePin(port_name,bit_number,BIT_LOW);
}
error_state_t RELAY_Toggle(uint8_t port_name,uint8_t bit_number)
{
	return DIO_TogglePin(port_name,bit_number);
}
error_state_t RELAY_ReadStatus(uint8_t port_name,uint8_t bit_number,ptr_uint8_t function_return)
{
	return DIO_ReadPin(port_name,bit_number,function_return);
}