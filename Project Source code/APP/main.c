/*
 * my drivers.c
 * Created: 01/10/2021 10:49:16 pm
 * Author : Mohamed Nasser
 */ 

#define F_CPU 8000000UL
#include <util/delay.h>
#include <avr/io.h>
#include "SOIL_MOISTURE_SENSOR.h"
#include "LCD.h"
#include "RELAY.h"


int main(void)
{
	/************************************************ strings ****************************************************/
	uint8_t title[7] = "Soil = ";
	uint8_t clear_result[9] = "         ";
	uint8_t sensor_reading = 0, transimited_value = 0;
	uint8_t pump_state;
	/************************************************ UART configration ******************************************/
	// to use UCSRC as  UCSRC register not  UBRRH register
	/*SET_BIT(UCSRC,URSEL);
	// set to asynchronous mode
	CLR_BIT(UCSRC,UMSEL);
	// no parity
	CLR_BIT(UCSRC,UPM0);
	CLR_BIT(UCSRC,UPM1);
	// one stop bit
	CLR_BIT(UCSRC,USBS);
	// 8 bits data size
	SET_BIT(UCSRC,UCSZ0);
	SET_BIT(UCSRC,UCSZ1);
	CLR_BIT(UCSRB,UCSZ2);
	// set baud rate to 9600 with freq = 8 MHZ
	UBRRH = 0x00;
	UBRRL = 51;
	// enable USART transmitter & Receiver
	SET_BIT(UCSRB,TXEN);
	SET_BIT(UCSRB,RXEN);*/
	UBRRH=(51>>8);
	UBRRL=51;
	UCSRC=0X8E;
	UCSRB=0X18;
	UCSRA=0X20;
	/************************************************ soil moisture sensor ***************************************/
	SOIL_MOISTURE_SENSOR_Init(ADC0);
	/************************************************ relay ******************************************************/
	RELAY_Init(PORT_D,2);
	/************************************************ LCD ********************************************************/
	LCD_Init();
	LCD_SendCommand(LCD_CLEAR_DISPALY);
	LCD_SendCommand(LCD_DISPLAYON_CURSOROFF_NOBLINKING);
	LCD_SendString(title);
	while (1)
	{
		sensor_reading = SOIL_MOISTURE_SENSOR_ReadSoilMoisture();
		LCD_SendCommand(LCD_LINE1_DDRAM_ADDRESS(7));
		LCD_SendString(clear_result);
		LCD_SendCommand(LCD_LINE1_DDRAM_ADDRESS(7));
		LCD_SendNumber(sensor_reading);
		LCD_SendData('%');
		_delay_ms(250);
		if (sensor_reading <= 75)//77
		{
			RELAY_TurnOn(PORT_D,2);
		}
		else
		{
			RELAY_TurnOff(PORT_D,2);
		}
		
		//reading pump state to change in bit(7) in the "sensor_reading"
		RELAY_ReadStatus(PORT_D,2,&pump_state);
		if (ON == pump_state)
		{
			transimited_value = sensor_reading|(1<<7);
		}
		else
		{
			transimited_value = sensor_reading&(~(1<<7));
		}
		
		//transmit via UART
		while (READ_BIT(UCSRA,UDRE) != 1);
		UDR = transimited_value;
		
		_delay_ms(1000);
		
	}
}