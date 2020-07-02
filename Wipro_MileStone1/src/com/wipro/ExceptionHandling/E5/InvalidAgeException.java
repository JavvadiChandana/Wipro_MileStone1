package com.wipro.ExceptionHandling.E5;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
}