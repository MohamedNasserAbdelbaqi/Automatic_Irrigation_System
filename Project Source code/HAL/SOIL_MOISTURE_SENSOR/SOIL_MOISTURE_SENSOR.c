/*
 * MOISTURE_SOIL_SENSOR.c
 * Created: 11/26/2021 11:30:24 pm
 * Author: Mohamed Nasser
 */ 

#include "SOIL_MOISTURE_SENSOR.h"

/* APIs for soil moisture sensor module */
error_state_t SOIL_MOISTURE_SENSOR_Init(uint8_t channel)
{
	uint8_t prescaler;
	#ifndef F_CPU 
		#define F_CPU 8000000UL
		prescaler = _64_DIVISION_FACTOR;
	#else
		#if (F_CPU == 1000000UL)
			prescaler = _8_DIVISION_FACTOR;
		#elif (F_CPU == 2000000UL)
			prescaler = _16_DIVISION_FACTOR;
		#elif (F_CPU == 4000000UL)
			prescaler = _32_DIVISION_FACTOR;
		#elif (F_CPU == 8000000UL)
			prescaler = _64_DIVISION_FACTOR;
		#endif
	#endif
	return ADC_Init(channel,prescaler);
}
uint8_t SOIL_MOISTURE_SENSOR_ReadSoilMoisture(void)
{
	//uint8_t soil_moisure_reading = ( (-100.0/723.0)*((double)ADC_ReadResult()) ) + 100 + (10000.0/241.0);
	uint8_t soil_moisure_reading = ( (-100.0/873.0)*((double)ADC_ReadResult()) ) + 100 + (5000.0/291.0);
	return soil_moisure_reading;
}

/*

			gfaf	moisture
1023		100		0
a			x		x
300			0		100
x = (a*100.0)/764;
*/