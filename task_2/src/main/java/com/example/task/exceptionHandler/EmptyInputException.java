package com.example.task.exceptionHandler;

public class EmptyInputException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EmptyInputException(String message) {
		super(message);
		
	}
}
