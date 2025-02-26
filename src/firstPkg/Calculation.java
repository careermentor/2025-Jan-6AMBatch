package firstPkg;

import org.testng.annotations.Test;

public class Calculation 
{


	public Calculation(int a, int b)
	{
		System.out.println("this is a constructor with parameter");
		
		int c = a+b;
		System.out.println("this is sum of 2 numbers: "+c);
	
	}
	
	
	
	public float sum()  //no input, or no argument or no parameter
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		float d = 20.5f;
		
		System.out.println("this is sum of 2 numbers: "+c);
		return d;
		
	}
	
	public float addition(float a, int b)  //input, argument or parameter
	{
		float c = a+b;
		System.out.println("this is addition of 2 numbers:" + c);
		return c;
	}
	
	//20.5, 30, 40
	//float x = 20.5+30
	//x+40
	
	public static void main(String[] args) 
	{
		Calculation cal = new Calculation(10,20);
		
		// cal.sum();
		
		
		//cal.addition(cal.sum(), 40);
		//float x = cal.addition(20.5f, 30);
		//cal.addition(x, 40);
		

	}

}
