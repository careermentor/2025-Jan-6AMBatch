package firstPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling
{

	public static void readpropfile() throws Exception
	{
		FileReader fr = new FileReader("./TestData/abc.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("Lang"));
		System.out.println(prop.get("Tool"));
	}
	
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line of the file");
		fw.flush();
		fw.close();
		
		
	}
	
	public static void readtextfile() throws Exception
	{
		//File f = new File("C:\\TestData\\data.txt");  //file connection
		File f = new File("./TestData/data.txt");
		
		
		FileReader fr = new FileReader(f);
		
	//	FileReader fr = new FileReader("C:\\TestData\\data.text");
		
		int r = fr.read();  //r=116, 104
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r=fr.read();
		}
	
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
	
		writedata();
		
	}

}
