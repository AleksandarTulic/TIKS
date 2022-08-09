package myExceptions;

/**
 *<h1>Dividing With Zero</h1>
 * This Exception will be thrown if the user tries to divide with zero in some method.
 * @author Aleksandar Tulic
 * @version 1.0
 * @since 2021-11-27
 *
 */

@SuppressWarnings("serial")
public class DivisionByZeroException extends Exception{
	public DivisionByZeroException() {
		super();
	}

	/**
	 * This constructor is used to show a specific message if this exception is thrown.
	 * */
	public DivisionByZeroException(String message) {
		super(message);
	}
}