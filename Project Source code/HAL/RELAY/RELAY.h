/*
 * RELAY.h
 * Created: 11/26/2021 11:20:44 pm
 * Author: Mohamed Nasser
 */ 


#ifndef RELAY_H_
#define RELAY_H_
 /* file includes */
 #include "STD_TYPES.h"
#include "DIO.h"

/* relay status */
#define OFF   0
#define ON    1

/* APIs for relay module */
error_state_t RELAY_Init(uint8_t port_name,uint8_t bit_number);
error_state_t RELAY_TurnOn(uint8_t port_name,uint8_t bit_number);
error_state_t RELAY_TurnOff(uint8_t port_name,uint8_t bit_number);
error_state_t RELAY_Toggle(uint8_t port_name,uint8_t bit_number);
error_state_t RELAY_ReadStatus(uint8_t port_name,uint8_t bit_number,ptr_uint8_t function_return);




#endif /* RELAY_H_ */