package project;

import myExceptions.*;

/**
 *<h1>Arithmetic operations</h1>
 * Calculator program is an application that allows users to calculate arithmetic operations, by that 
 * we mean Addition(+), Subtraction(-), Multiplication(*), Division(/).
 * <p>
 * <b>Note:</b> Any dividend divided by zero is undefined.
 * @author Aleksandar Tulic
 * @version 1.0
 * @since 2021-11-27
 *
 */

public class Calculator {
	private Double currentValue = 0.0;
	
	/**
	 * This constructor is used for initiating variable <i>currentValue</i> to zero.
	 * */
	public Calculator() {
		currentValue = 0.0;
	}
	 
	/**
	 * This method is used for calculating arithmetic expression, while the left value, in the expression, 
	 * is <i>currentValue</i> and the right value is the value passed by as parameter of the function.
	 * @param value This is the right side of the arithmetic expression
	 * @param operator This value tells us which operation to do
	 * @return No return value.
	 * @exception DivisionByZeroException If parameter value is zero.
	 * @exception NotSupportedOperationException If operator isn't one of the defined values, like +, /, *, -.
	 * @see DivisionByZeroException
	 * @see NotSupportedOperationException
	 * */
	public void calculate(Double value, char operator) throws DivisionByZeroException, NotSupportedOperationException{
		switch(operator) {
			case '+':
				currentValue = currentValue + value;
				break;
			case '-':
				currentValue = currentValue - value;
				break;
			case '*':
				currentValue = currentValue * value;
				break;
			case '/':
				if ( value == 0.0 )
					throw new DivisionByZeroException("Nije definisano dijeljenje sa nulom.");
				else
					currentValue = currentValue / value;
				break;
			default:
				throw new NotSupportedOperationException("Operacija nije podrzana.");
		}
	}

	/**
	 * This method gets the value of <i>currentValue</i>.
	 * @return double This returns the value of <i>currentValue</i>
	 * */
	public double getCurrentValue() {
		return currentValue;
	}

	/**
	 * This method sets the value of <i>currentValue</i>.
	 * @param currentValue This value will be set in <i>this.currentValue</i>
	 * @return No return value.
	 * */
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
}
