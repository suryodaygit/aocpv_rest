package com.suryoday.aocpv.aocpv.serviceImp;

public class NoSuchElementException extends RuntimeException{
	private static final long serialVersionUID = 1L;

		public NoSuchElementException(String errorMessage) {
			super(errorMessage);
		}
}
