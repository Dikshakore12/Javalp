package Fhp;

import java.io.FileWriter;
public class WriteF2
{
	public static void main(String[] args) {
		
		try
		{
			FileWriter F=new FileWriter("E:\\diksha\\dikshaji.txt");
			try
			{
				F.write("diksha yash chi bayko ani pakki maitrin");
			}
			finally
			{
				F.close();
			}
			System.out.println("data has been written");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 
	
