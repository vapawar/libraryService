package com.libraryexceptions;

public class RecordExcepton extends Exception {
	private static final long serialVersionUID = 1L;
	private int error_code;

	RecordExcepton() {
		super();
	}

	public RecordExcepton(String message, int errorCode) {
		super(message);
		this.error_code = errorCode;
	}

	public int getError_code() {
		return error_code;
	}

	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
}
