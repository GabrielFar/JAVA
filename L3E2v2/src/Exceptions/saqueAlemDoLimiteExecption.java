package Exceptions;

public class saqueAlemDoLimiteExecption extends RuntimeException{

	private static final long serialVersionUID = 7413054821374321810L;

	/**
	 * 
	 */

	public saqueAlemDoLimiteExecption(String msn) {
		super(msn);
	}
}
