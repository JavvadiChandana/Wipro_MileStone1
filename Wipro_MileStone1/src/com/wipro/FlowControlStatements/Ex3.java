package com.wipro.FlowControlStatements;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=args.length;
		if(c==0)
		System.out.println("No Values");
		else
		{
		for(int i=0;i<c;i++)
		{
		if(i!=c-1)
		System.out.print(args[i]+",");
		else
		System.out.print(args[i]);
		}
		}
	}

}
