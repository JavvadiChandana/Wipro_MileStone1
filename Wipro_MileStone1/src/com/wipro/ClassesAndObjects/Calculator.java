package com.wipro.ClassesAndObjects;

public class Calculator {

	 static double powerInt(int num1,int num2)
	    {
	        return Math.pow(num1,num2);
	    }
	static double powerDouble(double num1,int num2)
	{
	    return Math.pow(num1,num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.powerInt(50,8));
		System.out.println(Calculator.powerDouble(55.0, 4));
	}

}
