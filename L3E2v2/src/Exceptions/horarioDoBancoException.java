package Exceptions;

public class horarioDoBancoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3871195614790774498L;

	public horarioDoBancoException(String msn) {
		super(msn);
	}
}
