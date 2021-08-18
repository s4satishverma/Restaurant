package com.mp.experiment;

interface   HelloWorld{
	  void show();
	}

 // removed conflicts
public class Test implements HelloWorld{
	
	public static void main(String...a)
	{
	 System.out.println("hi");
	}
}
