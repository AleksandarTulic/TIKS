package myExceptions;

/**
 *<h1>Number Not In Range</h1>
 * This Exception will be thrown if the value is not in specific range.
 * <br>
 * <b>Note: </b> It can be any value that is not in range for specific job.
 * @author Aleksandar Tulic
 * @version 1.0
 * @since 2021-11-27
 *
 */

@SuppressWarnings("serial")
public class NumberNotInAreaException extends Exception{
	public NumberNotInAreaException() {
		super();
	}

	/**
	 * This constructor is used to show a specific message if this exception is thrown.
	 * */
	public NumberNotInAreaException(String message) {
		super(message);
	}
}
