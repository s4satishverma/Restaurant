package com.mp.experiment;

 interface A{
	
	default public void print()
	{
	 System.out.println("Hello A");	
	}
}

 interface B{
	default public void print()
	{
	 System.out.println("Hello B");	
	}
}
 
public class Test implements A,B{

	public void print() {
		 System.out.println("Hello Test ");	
	}
	
	public static void main(String...a)
	{
	  new Test().print();	
	}
}
