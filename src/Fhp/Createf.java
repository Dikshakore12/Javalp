package Fhp;

import java.io.File;
public class Createf 
{
	//in this file we'll create an file 
	public static void main(String[] args) {
		File f=new File("E:\\diksha");
		try
		{
			if(f.createNewFile()) //new file create krega
			{
				System.out.println("File Created Successfully");//agr file bni to created successfully
			}
			else
			{
				System.out.println("Already Exists");//nhi ban pai ok!!!
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
