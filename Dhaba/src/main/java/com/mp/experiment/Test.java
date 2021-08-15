package com.mp.experiment;

interface A{
	
	default public void print()
	{
	 System.out.println("Hello print...");	
	}
	default public void printB()
	{
	 System.out.println("Hello print B");	
	}
}

interface Btest{
	
	default public void printTest()
	{
	 System.out.println("Hello print...");	
	}
	default public void printBTest()
	{
	 System.out.println("Hello print B");	
	}
}

 
 // removed conflicts
public class Test implements A{
	
	public static void main(String...a)
	{
	  new Test().print();	
	}
}
