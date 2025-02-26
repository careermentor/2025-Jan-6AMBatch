package oopsConcept;

public class CallDemoInterface implements DemoInterface
{


	public void m1() {
		
		System.out.println("this is method1 of interface");
	}

	
	public void m2() {
		
		System.out.println("this is method2 of interface");
	}

	
	public static void main(String[] args)
	{
	
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.m1();
		cdi.m2();
		
	}
	
	
}
