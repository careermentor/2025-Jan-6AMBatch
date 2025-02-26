package firstPkg;

 public class FirstJavaProgram 
{

	 int x = 500; //global variable
	// x=600;
	float b = 10.5f;
	char c = 'x';
	String d = "Java";
	boolean e = false;
	
	int f = 500;
	
	 public void firstmethod()
	{
		final int a = 20;   //local variable
		// a=30;
		 
		 System.out.println(x);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("This is java method");
		System.out.println(100);
	}

	 void meth2()
	{
		
		System.out.println(x);
		//System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		
		FirstJavaProgram abc = new FirstJavaProgram();
		abc.firstmethod();
		
		System.out.println(abc.f);
		
	}


}
