/*
 * BIT_MATH.h
 * Created: 02/10/2021 03:07:16 am
 * Author: Mohamed Nasser
 */ 


#ifndef BIT_MATH_H_
#define BIT_MATH_H_

#define REGISTER_SIZE                  8
#define SET_BIT(reg,bit_number)        reg |= (1<<bit_number)										
#define CLR_BIT(reg,bit_number)        reg &= (~(1<<bit_number))
#define TOG_BIT(reg,bit_number)        reg ^= (1<<bit_number)
#define READ_BIT(reg,bit_number)       ((reg&(1<<bit_number))>>bit_number)
#define IS_BIT_SET(reg,bit_number)     ((reg&(1<<bit_number))>>bit_number)
#define IS_BIT_CLR(reg,bit_number)     !((reg&(1<<bit_number))>>bit_number)
#define ROR_REG(reg,num_of_rotation)   reg = (reg<<(REGISTER_SIZE-num_of_rotation))|(reg>>(num_of_rotation))
#define ROL_REG(reg,num_of_rotation)   reg = (reg>>(REGISTER_SIZE-num_of_rotation))|(reg<<(num_of_rotation))

#endif /* BIT_MATH_H_ */