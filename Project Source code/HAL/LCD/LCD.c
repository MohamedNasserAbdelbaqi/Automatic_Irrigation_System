/*
 * File Name: LCD.c
 * Creation Date: 07/23/2020
 * Author: Rehab
 * Description: C File for LCD...
 */ 

#include "LCD.h"

extern Str_LCDConfig_t gastr_LCDConfig[];
													
uint8_t LCD_Init(void)
{
	for(uint8_t au8_IterationNo=0;au8_IterationNo<LCD_PINS_NUMBER;au8_IterationNo++)
	{
		DIO_SetPinDirection(	gastr_LCDConfig[au8_IterationNo].LCDPort,
								gastr_LCDConfig[au8_IterationNo].LCDPin,
								gastr_LCDConfig[au8_IterationNo].LCDDirection );			
	}
					
	#ifdef LCD_RW_PIN
		DIO_WritePin(	gastr_LCDConfig[LCD_RW_PIN].LCDPort,
						gastr_LCDConfig[LCD_RW_PIN].LCDPin,
						WRITE );//Write on  LCD	
	#endif
	
	DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
					gastr_LCDConfig[LCD_EN_PIN].LCDPin,
					BIT_HIGH );	
	
	#if LCD_MODE==LCD4BITSMODE
		LCD_SendCommand(0X30);
		LCD_SendCommand(0X30);
		LCD_SendCommand(0X30);
		LCD_SendCommand(0X02);
		LCD_SendCommand(LCD_4BITS_2LINE_5X8);
		for(unsigned int i=0;i<1000;i++);
	#elif LCD_MODE==LCD8BITSMODE
		LCD_SendCommand(0X30);
		LCD_SendCommand(0X30);
		LCD_SendCommand(0X30);
		LCD_SendCommand(LCD_8BITS_2LINE_5X8);
		for(unsigned int i=0;i<1000;i++);
	#endif
	
	LCD_SendCommand(LCD_CLEAR_DISPALY);
	LCD_SendCommand(LCD_DISPLAYON_CURSORON_NOBLINKING);
	LCD_SendCommand(LCD_INC_AC);
	return 0;
}

uint8_t LCD_SendCommand(uint8_t Cmd)
{
	DIO_WritePin(	gastr_LCDConfig[LCD_RS_PIN].LCDPort,
					gastr_LCDConfig[LCD_RS_PIN].LCDPin,
					IR );	
					
	#if LCD_MODE==LCD4BITSMODE
		DIO_WritePin(	gastr_LCDConfig[LCD_D4_PIN].LCDPort,
						gastr_LCDConfig[LCD_D4_PIN].LCDPin,
						READ_BIT(Cmd,4) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D5_PIN].LCDPort,
						gastr_LCDConfig[LCD_D5_PIN].LCDPin,
						READ_BIT(Cmd,5) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D6_PIN].LCDPort,
						gastr_LCDConfig[LCD_D6_PIN].LCDPin,
						READ_BIT(Cmd,6) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D7_PIN].LCDPort,
						gastr_LCDConfig[LCD_D7_PIN].LCDPin,
						READ_BIT(Cmd,7) );
						
		//Enable				
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_HIGH );	
		for(unsigned int i=0;i<1000;i++);
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_LOW );		
		for(unsigned int i=0;i<1000;i++);
		
		
		DIO_WritePin(	gastr_LCDConfig[LCD_D4_PIN].LCDPort,
						gastr_LCDConfig[LCD_D4_PIN].LCDPin,
						READ_BIT(Cmd,0) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D5_PIN].LCDPort,
						gastr_LCDConfig[LCD_D5_PIN].LCDPin,
						READ_BIT(Cmd,1) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D6_PIN].LCDPort,
						gastr_LCDConfig[LCD_D6_PIN].LCDPin,
						READ_BIT(Cmd,2) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D7_PIN].LCDPort,
						gastr_LCDConfig[LCD_D7_PIN].LCDPin,
						READ_BIT(Cmd,3) );

		//Enable				
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_HIGH );	
		for(unsigned int i=0;i<1000;i++);
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_LOW );		
		for(unsigned int i=0;i<1000;i++);
					
	#elif LCD_MODE==LCD8BITSMODE
		DIO_WritePin(	gastr_LCDConfig[LCD_D0_PIN].LCDPort,
						gastr_LCDConfig[LCD_D0_PIN].LCDPin,
						READ_BIT(Cmd,0) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D1_PIN].LCDPort,
						gastr_LCDConfig[LCD_D1_PIN].LCDPin,
						READ_BIT(Cmd,1) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D2_PIN].LCDPort,
						gastr_LCDConfig[LCD_D2_PIN].LCDPin,
						READ_BIT(Cmd,2) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D3_PIN].LCDPort,
						gastr_LCDConfig[LCD_D3_PIN].LCDPin,
						READ_BIT(Cmd,3) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D4_PIN].LCDPort,
						gastr_LCDConfig[LCD_D4_PIN].LCDPin,
						READ_BIT(Cmd,4) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D5_PIN].LCDPort,
						gastr_LCDConfig[LCD_D5_PIN].LCDPin,
						READ_BIT(Cmd,5) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D6_PIN].LCDPort,
						gastr_LCDConfig[LCD_D6_PIN].LCDPin,
						READ_BIT(Cmd,6) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D7_PIN].LCDPort,
						gastr_LCDConfig[LCD_D7_PIN].LCDPin,
						READ_BIT(Cmd,7) );

		//Enable				
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_HIGH );	
		for(unsigned int i=0;i<1000;i++);
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_LOW );		
		for(unsigned int i=0;i<1000;i++);
	
	#endif	
	return 0;
}

uint8_t LCD_SendData(uint8_t Data)
{
	DIO_WritePin(	gastr_LCDConfig[LCD_RS_PIN].LCDPort,
					gastr_LCDConfig[LCD_RS_PIN].LCDPin,
					DR );	
					
	#if LCD_MODE==LCD4BITSMODE
		DIO_WritePin(	gastr_LCDConfig[LCD_D4_PIN].LCDPort,
						gastr_LCDConfig[LCD_D4_PIN].LCDPin,
						READ_BIT(Data,4) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D5_PIN].LCDPort,
						gastr_LCDConfig[LCD_D5_PIN].LCDPin,
						READ_BIT(Data,5) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D6_PIN].LCDPort,
						gastr_LCDConfig[LCD_D6_PIN].LCDPin,
						READ_BIT(Data,6) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D7_PIN].LCDPort,
						gastr_LCDConfig[LCD_D7_PIN].LCDPin,
						READ_BIT(Data,7) );
						
		//Enable				
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_HIGH );	
		for(unsigned int i=0;i<1000;i++);
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_LOW );		
		for(unsigned int i=0;i<1000;i++);
		
		
		DIO_WritePin(	gastr_LCDConfig[LCD_D4_PIN].LCDPort,
						gastr_LCDConfig[LCD_D4_PIN].LCDPin,
						READ_BIT(Data,0) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D5_PIN].LCDPort,
						gastr_LCDConfig[LCD_D5_PIN].LCDPin,
						READ_BIT(Data,1) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D6_PIN].LCDPort,
						gastr_LCDConfig[LCD_D6_PIN].LCDPin,
						READ_BIT(Data,2) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D7_PIN].LCDPort,
						gastr_LCDConfig[LCD_D7_PIN].LCDPin,
						READ_BIT(Data,3) );

		//Enable				
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_HIGH );	
		for(unsigned int i=0;i<1000;i++);
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_LOW );		
		for(unsigned int i=0;i<1000;i++);
					
	#elif LCD_MODE==LCD8BITSMODE
		DIO_WritePin(	gastr_LCDConfig[LCD_D0_PIN].LCDPort,
						gastr_LCDConfig[LCD_D0_PIN].LCDPin,
						READ_BIT(Data,0) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D1_PIN].LCDPort,
						gastr_LCDConfig[LCD_D1_PIN].LCDPin,
						READ_BIT(Data,1) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D2_PIN].LCDPort,
						gastr_LCDConfig[LCD_D2_PIN].LCDPin,
						READ_BIT(Data,2) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D3_PIN].LCDPort,
						gastr_LCDConfig[LCD_D3_PIN].LCDPin,
						READ_BIT(Data,3) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D4_PIN].LCDPort,
						gastr_LCDConfig[LCD_D4_PIN].LCDPin,
						READ_BIT(Data,4) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D5_PIN].LCDPort,
						gastr_LCDConfig[LCD_D5_PIN].LCDPin,
						READ_BIT(Data,5) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D6_PIN].LCDPort,
						gastr_LCDConfig[LCD_D6_PIN].LCDPin,
						READ_BIT(Data,6) );
		DIO_WritePin(	gastr_LCDConfig[LCD_D7_PIN].LCDPort,
						gastr_LCDConfig[LCD_D7_PIN].LCDPin,
						READ_BIT(Data,7) );

		//Enable				
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_HIGH );	
		for(unsigned int i=0;i<1000;i++);
		DIO_WritePin(	gastr_LCDConfig[LCD_EN_PIN].LCDPort,
						gastr_LCDConfig[LCD_EN_PIN].LCDPin,
						BIT_LOW );		
		for(unsigned int i=0;i<1000;i++);
	
	#endif
	return 0;	
}

uint8_t LCD_SendString(ptr_uint8_t String)
{
	while(*String!='\0')
	{
		LCD_SendData(*String);
		String++;
	} 	
	return 0;
}

uint8_t LCD_SendNumber(unsigned int Number)
{
	uint8_t Numbers[10];
	sint8_t Count;
	if(Number==0)
	{
		LCD_SendData(48);
		return 0;
	}
	for(Count=0;Number>0;Count++)
	{
		Numbers[Count]=(Number%10)+48;
		Number=Number/10;
	}
	for(Count--;Count>=0;Count--)
	{
		LCD_SendData(Numbers[Count]);
	}	
	return 0;
}