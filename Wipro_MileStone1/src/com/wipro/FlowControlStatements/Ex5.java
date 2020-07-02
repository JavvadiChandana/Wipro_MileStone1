package com.wipro.FlowControlStatements;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='C';
		if(( a>=65 &&  a<=90)||( a>=97 &&  a<=122))
		System.out.println("Alphabet");
		else if( a>= 48 &&  a<= 57)
		System.out.println("Digit");
		else
		System.out.println("Special Character");
	}

}
