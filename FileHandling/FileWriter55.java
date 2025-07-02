package FileHandling;

import java.io.FileWriter; //this package is must
import java.io.IOException;
public class FileWriter55 
{
	public static void main(String[] args) {
//		FileWriter55 F=new FileWriter55("");
		try 
		{
			//above is file creation
			FileWriter F=new FileWriter("C:\\Users\\Yash\\Desktop\\Lc.txt");//yha FileWriter hi likhna pdega
			try
				{
					//write operation here.
					F.write("Yash Hello");
				}
			finally
			{
				//this will close the file 
				//exception rhe ya na rhe doesn't matter.
				//ex agr mobile se data share kr rhe h to data share hone k bad me connection
				//disconnet ho jana chahiye for security reason.
				F.close();
			} System.out.println("The data has been written in the file");
		}
		catch(Exception i)
		{
			System.out.println(i);
		}
	}
}
