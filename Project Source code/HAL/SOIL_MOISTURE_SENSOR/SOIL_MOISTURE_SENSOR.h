/*
 * MOISTURE_SOIL_SENSOR.h
 * Created: 11/26/2021 11:29:55 pm
 * Author: Mohamed Nasser
 */ 


#ifndef SOIL_MOISTURE_SENSOR_H_
#define SOIL_MOISTURE_SENSOR_H_

/* file includes */
#include "STD_TYPES.h"
#include "ADC.h"

/* APIs for soil moisture sensor module */
error_state_t SOIL_MOISTURE_SENSOR_Init(uint8_t channel);
uint8_t SOIL_MOISTURE_SENSOR_ReadSoilMoisture(void);

#endif /* MOISTURE_SOIL_SENSOR_H_ */