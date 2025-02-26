package oopsConcept;

public class DemoEncapsulation 
{

	private int a;  //global

	public int getA() 
	{
		return a;
	}

	public void setA(int a)  //local
	{
		this.a = a;
	}
	
	
	private String name;

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}
