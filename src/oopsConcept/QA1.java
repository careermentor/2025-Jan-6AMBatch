package oopsConcept;

public class QA1
{

	int x = 500;
	
	public QA1()
	{
		System.out.println("this is constructor");
	}
	
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a&b&c: " + d);
	}
	
	public static void main(String[] args) 
	{
	
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		q1.sum(10, 20.5f);
		q1.sum(10, 20, 30);
		q1.sum();
		
	}
	
}
