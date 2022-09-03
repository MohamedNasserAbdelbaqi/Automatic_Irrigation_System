/*
 * INTERRUPT.c
 * Created: 15/10/2021 10:49:42 pm
 * Author: Mohamed Nasser
 */ 

#include <avr/io.h>
#include "INTERRUPT.h"

/* APIs for enable external interrupt */
void INTERRUPT_EnableINT0(void)
{
	CLR_BIT(DDRD,2); //to make INT0 pin as input pin
	SET_BIT(GICR,INT0);
}
void INTERRUPT_EnableINT1(void)
{
	CLR_BIT(DDRD,3); //to make INT1 pin as input pin
	SET_BIT(GICR,INT1);
}
void INTERRUPT_EnableINT2(void)
{
	CLR_BIT(DDRB,2); //to make INT2 pin as input pin
	SET_BIT(GICR,INT2);
}
/* APIs for disable external interrupt */
void INTERRUPT_DisableINT0(void)
{
	CLR_BIT(GICR,INT0);
}
void INTERRUPT_DisableINT1(void)
{
	CLR_BIT(GICR,INT1);
}
void INTERRUPT_DisableINT2(void)
{
	CLR_BIT(GICR,INT2);
}
/* APIs for set external interrupt sense control */
error_state_t INTERRUPT_SetSenceControlINT0(uint8_t interrupt_sense_control)
{
	error_state_t error_state = ERROR_OK;
	switch(interrupt_sense_control)
	{
		case LOW_LEVEL:
			CLR_BIT(MCUCR,ISC00);
			CLR_BIT(MCUCR,ISC01);
			break;
		case ANY_LOGICAL_CHANGE:
			SET_BIT(MCUCR,ISC00);
			CLR_BIT(MCUCR,ISC01);
			break;
		case FALLING_EDGE:
			CLR_BIT(MCUCR,ISC00);
			SET_BIT(MCUCR,ISC01);
			break;
		case RISING_EDGE:
			SET_BIT(MCUCR,ISC00);
			SET_BIT(MCUCR,ISC01);
			break;
		default:
			error_state = INTERRUPT_ERROR_INVALID_SENSE_CONTROL;
			break;
	}
	return error_state;
}
error_state_t INTERRUPT_SetSenceControlINT1(uint8_t interrupt_sense_control)
{
	error_state_t error_state = ERROR_OK;
	switch(interrupt_sense_control)
	{
		case LOW_LEVEL:
			CLR_BIT(MCUCR,ISC10);
			CLR_BIT(MCUCR,ISC11);
			break;
		case ANY_LOGICAL_CHANGE:
			SET_BIT(MCUCR,ISC10);
			CLR_BIT(MCUCR,ISC11);
			break;
		case FALLING_EDGE:
			CLR_BIT(MCUCR,ISC10);
			SET_BIT(MCUCR,ISC11);
			break;
		case RISING_EDGE:
			SET_BIT(MCUCR,ISC10);
			SET_BIT(MCUCR,ISC11);
			break;
		default:
			error_state = INTERRUPT_ERROR_INVALID_SENSE_CONTROL;
			break;
	}
	return error_state;
}
error_state_t INTERRUPT_SetSenceControlINT2(uint8_t interrupt_sense_control)
{
	error_state_t error_state = ERROR_OK;
	switch(interrupt_sense_control)
	{
		case FALLING_EDGE:
			CLR_BIT(MCUCSR,ISC2);
			break;
		case RISING_EDGE:
			SET_BIT(MCUCSR,ISC2);
			break;
		default:
			error_state = INTERRUPT_ERROR_INVALID_SENSE_CONTROL;
			break;
	}
	return error_state;
}
/* APIs for read external interrupt flag */
uint8_t INTERRUPT_ReadINT0Flag(void)
{
	return READ_BIT(GIFR,INT0);
}
uint8_t INTERRUPT_ReadINT1Flag(void)
{
	return READ_BIT(GIFR,INT1);
}
uint8_t INTERRUPT_ReadINT2Flag(void)
{
	return READ_BIT(GIFR,INT2);
}
/* APIs for clear external interrupt flag */
void INTERRUPT_ClearINT0Flag(void)
{
	SET_BIT(GIFR,INT0);
}
void INTERRUPT_ClearINT1Flag(void)
{
	SET_BIT(GIFR,INT1);
}
void INTERRUPT_ClearINT2Flag(void)
{
	SET_BIT(GIFR,INT2);
}
/* APIs for control global interrupt bit */
void INTERRUPT_EnableGlobalINT(void)
{
	SET_BIT(SREG,I);
}
void INTERRUPT_DisableGlobalINT(void)
{
	CLR_BIT(SREG,I);
}