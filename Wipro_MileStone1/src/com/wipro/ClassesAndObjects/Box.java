package com.wipro.ClassesAndObjects;

public class Box {
		// TODO Auto-generated method stub
			double h,w,d;

		    Box(double width,double height,double depth)
		   {
		       h=height;
		       w=width;
		       d=depth;
		   }
		   double volume()
		   { double v;
		   v=h*w*d;
		   return v;
		   }
		  
		   public static void main(String[] args) {
		      
		   Box obj = new Box(7.4,10.5,6.8);
		   System.out.println(obj.volume());
		   }
}
