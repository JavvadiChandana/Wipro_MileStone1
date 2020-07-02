package com.wipro.Inheritance;

public class Animal {
			void eat()
			{
			  System.out.println("Animal is Eating");
			}
			void sleep()
			{
			  System.out.println("Animal is Sleeping");
			}
			public static void main(String[] args)
			{
				Animal a= new Animal();
				Bird b=new Bird();
				a.eat();
				a.sleep();
				b.eat();
				b.sleep();
				b.fly();
			}
			
}

			class Bird extends Animal{
			  void eat()
			  {
			    System.out.println("Bird is Eating");
			  }
			  void sleep()
			  {
			    System.out.println("Bird is Sleeping");
			  }
			  void fly()
			  {
			    System.out.println("Bird is flying");
			  }
	}
