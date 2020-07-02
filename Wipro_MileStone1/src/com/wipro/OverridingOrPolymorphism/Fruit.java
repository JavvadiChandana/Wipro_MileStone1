package com.wipro.OverridingOrPolymorphism;

	public class Fruit {
		  char name,taste,size;
		  
		  void eat()
		  {
		    System.out.println("name:Guava");
		    System.out.println("taste:sweet");
		  }
		  public static void main(String args[])
		  {
		    Apple a=new Apple();
		    a.eat();
		    Orange o=new Orange();
		    o.eat();
		  }
		}
	class Apple extends Fruit{
		  void eat()
		  {
		    System.out.println("name:Apple");
		    System.out.println("taste:sour");
		  }
	}
	
	class Orange extends Fruit{
		  void eat()
		  {
		    System.out.println("name:Orange");
		    System.out.println("taste:sweeet");
		  }
		}