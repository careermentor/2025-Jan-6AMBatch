package oopsConcept;

public class QA2 extends QA1
{

	int x = 100;  //global
	
	public void printVal()
	{
		final int x = 200; //local 
		//x=300;
		System.out.println(x);  //200
		
		System.out.println(this.x); //100
		
		System.out.println(super.x);
		
		super.sum(20, 30);
	}
	
	
	
	
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("subs of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sum(20, 30);
		//q2.sub(30, 20);
		
		//q2.sum(20, 40, 60);
		
		
		//QA1 q21 = new QA1();
		//q21.sum(30, 40);
		//q2.qa1im();
		
		q2.printVal();
		
		DemoStaticKeyword.printVal();
		
		System.out.println(q2.x);
		
		
	}

	
	public void qa1im() {
	
		System.out.println("this method is from QA1I interface");
		
	}
	
}
