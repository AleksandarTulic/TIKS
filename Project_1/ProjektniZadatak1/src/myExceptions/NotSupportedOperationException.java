package myExceptions;

/**
 *<h1>Not Supported Operation</h1>
 * This Exception will be thrown if the user passes arguments which won't lead to some operation.
 * @author Aleksandar Tulic
 * @version 1.0
 * @since 2021-11-27
 *
 */

@SuppressWarnings("serial")
public class NotSupportedOperationException extends Exception{
	public NotSupportedOperationException() {
		super();
	}

	/**
	 * This constructor is used to show a specific message if this exception is thrown.
	 * */
	public NotSupportedOperationException(String message) {
		super(message);
	}
}
