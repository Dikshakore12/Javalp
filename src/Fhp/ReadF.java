package Fhp;

import java.io.FileReader;
public class ReadF {
	public static void main(String[] args) {
		
		try
		{
			FileReader Fr=new FileReader("E:\\diksha\\dikshaji.txt");
			try
			{
				int i;
				while((i=Fr.read()) !=-1)
				{
					System.out.println((char)i);
				}
			}
			finally
			{
				Fr.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}
	}
	
}
