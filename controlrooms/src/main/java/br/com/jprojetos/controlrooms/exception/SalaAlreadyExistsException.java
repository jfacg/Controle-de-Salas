package br.com.jprojetos.controlrooms.exception;

public class SalaAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalaAlreadyExistsException(final String message) {
        super(message);
    }
}
