package com.wipro.FlowControlStatements;

public class Ex1_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int ra=a%10;
		int rb=b%10;
		if(ra==rb)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
