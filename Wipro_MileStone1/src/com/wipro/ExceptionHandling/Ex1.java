package com.wipro.ExceptionHandling;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sco.nextInt();
		System.out.println("Enter the elements in the array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sco.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		try
		{
			int I=sco.nextInt();
			System.out.println("The array element at index "+I+" = "+arr[I]);
			System.out.println("The array element is successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} 
		catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}

		sco.close();
}

}
