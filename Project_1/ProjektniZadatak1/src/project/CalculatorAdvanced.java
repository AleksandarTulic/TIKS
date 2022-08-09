package project;

import myExceptions.*;

/**
 *<h1>Calculating more advanced concepts</h1>
 * Advanced Calculator program is an application that allows users to do following operations:
 * find factorial or degree(<i>power</i>) of number, check if a number is: perfect, Armstrong's numbers or something else.
 * <p>
 * @author Aleksandar Tulic
 * @version 1.0
 * @since 2021-11-27
 * @see Calculator
 *
 */

public class CalculatorAdvanced extends Calculator{
	/**
	 * This constructor is used for initiating variable <i>currentValue</i> to zero.
	 * */
	public CalculatorAdvanced() {
		super();
	}
	
	/**
	 * This method is used for calculating factorial(!) or degree of integer value stored in <i>currentValue</i> variable.
	 * <br><b>Note: </b>If integer value of variable <i>currentValue</i> is not in range of [0, 10] then for factorial we will throw 
	 * NumberNotInAreaException, while if the passed parameter <i>action</i> is non of the defined(! or value between 0 and 9) then
	 * we will throw NotSupportedOperationException.
	 * @param action This parameter tells us which operation will be performed.
	 * @return No return value.
	 * @exception NotSupportedOperationException If operator isn't one of the defined values, like '!' or range of values ['0', '9']
	 * @exception NumberNotInAreaException If integer value of variable <i>currentValue</i> is not in range [0, 10] if we are performing operation factorial
	 * @see NotSupportedOperationException
	 * @see NumberNotInAreaException
	 * */
	public void calculateAdvanced(char action) throws NumberNotInAreaException, NotSupportedOperationException {
		if ( action == '!' ) {
			int value = (int)getCurrentValue();
			int res = 1;
			
			if ( value >= 0 && value <= 10 ) {
				for (int i=2;i<=value;i++)
					res*=i;
				
				setCurrentValue(value == 0 ? 1.0 : res);
			}else
				throw new NumberNotInAreaException("Broj nije u odgovarajucem rang-u.");
		}else if ( action >= '0' && action <= '9' ) {
			if ( action == '0' )
				setCurrentValue(1.0);
			else {
				Integer res = (int)getCurrentValue();
				for (int i=0;i<(int)(action-'0')-1;i++) {
					res*=(int)getCurrentValue();
				}
				
				setCurrentValue(res);
			}
		}else
			throw new NotSupportedOperationException("Operacija nije podrzana.");
	}
	
	/**
	 * This method is used for checking if the integer value of <i>currentValue</i> is Armstrong's or perfect number.
	 * <br><b>Note: </b>If value passed in parameter <i>value</i> is different then A or P then this function will throw
	 * NotSupportedOperationException, or if the integer value of parameter <i>currentValue</i> is less than 1
	 * we will throw NumberNotInAreaException.
	 * @param value This parameter tells us which operation will be performed
	 * @return True if the calculated value is the same as integer part of variable <i>currentValue</i>, in other cases it returns False.
	 * @exception NotSupportedOperationException If operator isn't one of the defined values, like 'A' or 'P'
	 * @exception NumberNotInAreaException If integer value of variable <i>currentValue</i> is less then 1
	 * @see NotSupportedOperationException
	 * @see NumberNotInAreaException
	 * */
	public Boolean hasCharacteristic(char value) throws NumberNotInAreaException, NotSupportedOperationException{
		int val = (int) getCurrentValue();
		int sum = 0;

		if ( val < 1 )
			throw new NumberNotInAreaException("Broj nije u odgovarajucem rang-u.");
		
		if ( value == 'A' ) {
			int power = 0;
			while ( val > 0 ) {
				power++;
				val/=10;
			}
			
			val = (int)getCurrentValue();
			
			while ( val > 0 ) {
				int element = val % 10;
				val/=10;
				
				int buffer = 1;
				for (int i=0;i<power;i++)
					buffer*=element;
				
				sum+=buffer;
			}

			if ( sum == (int)getCurrentValue() )
				return true;
		}else if ( value == 'P' ) {
			for (int i=1;i<val;i++) 
				if ( val % i == 0 )
					sum+=i;
			
			if ( sum == val )
				return true;
		}else {
			throw new NotSupportedOperationException("Operacija nije podrzana.");
		}
		
		return false;
	}
}
