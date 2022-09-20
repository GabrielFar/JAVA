package Exceptions;

public class depositoInvalidoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 384556145852449536L;

	public depositoInvalidoException(String msn) {
		super(msn); 
	}
}
