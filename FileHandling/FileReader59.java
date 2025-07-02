package FileHandling;
import java.io.*;
import java.io.FileReader;

//Reading from a file
public class FileReader59 {
	public static void main(String[] args) {
		try
		{//ye niche vali file already bni hui h. just read krna h
			//now import the file
			FileReader r=new FileReader("C:\\Users\\Yash\\Desktop\\Lc.txt");
			//now read the file
			try
			{
				int i;
				while((i=r.read())!=-1) //this read will read char by char and op in int form
				{
					System.out.println((char)i);
				}
			}
			finally
			{
				r.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
}
