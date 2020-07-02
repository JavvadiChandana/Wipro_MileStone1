package com.wipro.FlowControlStatements;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b=args[0];
		int a =Integer.parseInt(args[1]);

		if(b.equals("Female"))
		{
		if(a>=1&&a<=58)
		System.out.println("8.2%");
		else
		System.out.println("9.2%");
		}

		else
		{
		if(a>=1&&a<=58)
		System.out.println("8.4%");
		else
		System.out.println("10.5%");
		}
	}

}
