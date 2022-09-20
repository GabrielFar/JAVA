package Exceptions;

public class cpfNaoCadastradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6011098862768866553L;
	
	public cpfNaoCadastradoException(String msn) {
		super(msn);
	}
}
