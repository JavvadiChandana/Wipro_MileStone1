package com.wipro.FlowControlStatements;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=args[0].charAt(0);
		if(a>='a'&&a<='z')
		{
		char b=(char)(a-32);
		System.out.println(b);
		}
		else if(a>='A'&& a<='Z')
		{
		char c=(char)(a+32);
		System.out.println(c);
		}
	}

}
