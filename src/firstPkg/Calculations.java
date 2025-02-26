package firstPkg;

public class Calculations 
{

	public void sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);  //50
		
		System.out.println("this is sum of 2 numbers: "+c);
		
		System.out.println(a+b);  //50
		
		System.out.println("a" + b);  //a30
		System.out.println("a" + "b");  //ab
		
	}
	
	
	public void addition(int a, int b)
	{
		int c = a+b;
		System.out.println("this is addition of 2 numbers:" + c);
	}
	
	public static void main(String[] args) 
	{
		Calculations cal = new Calculations();
		cal.sum();
		cal.addition(30, 40);
		cal.addition(40, 50);

	}

}
