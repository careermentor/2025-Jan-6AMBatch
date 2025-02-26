package oopsConcept;

public class DemoStaticKeyword 
{

	static int a = 20;
	
	public static void printVal()
	{
		
		System.out.println(a);
	}
	
	public void meth2()
	{
		System.out.println("this method is non-static method");
	}
	
	
	public static void main(String[] args)
	{
		DemoStaticKeyword dsk = new DemoStaticKeyword();
		dsk.meth2();
		
		printVal();
		
		System.out.println(a);
		
	}
	
}
