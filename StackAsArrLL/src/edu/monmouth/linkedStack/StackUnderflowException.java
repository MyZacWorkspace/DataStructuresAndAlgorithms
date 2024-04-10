package edu.monmouth.linkedStack;

public class StackUnderflowException extends Exception {
	private static final long serialVersionUID = 1L;
	public StackUnderflowException() {
		super();
	}
	public StackUnderflowException(String msg) {
		super(msg);
	}
}
