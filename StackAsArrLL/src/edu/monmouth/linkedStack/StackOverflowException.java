package edu.monmouth.linkedStack;

public class StackOverflowException extends Exception {
	private static final long serialVersionUID = 1L;
	public StackOverflowException() {
		super();
	}
	public StackOverflowException(String msg) {
		super(msg);
	}
}
