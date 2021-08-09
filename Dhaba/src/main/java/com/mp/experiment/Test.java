package com.mp.experiment;

interface A{
	
	default public void print()
	{
	 System.out.println("Hello A");	
	}
}

 interface B{
	default public void printB()
	{
	 System.out.println("Hello B");	
	}
}
 
 // removed conflicts
public class Test implements A,B{
	
	public static void main(String...a)
	{
	  new Test().print();	
	}
}
