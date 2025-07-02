package FileHandling;

import java.io.File;
	//file k sath kam krne k samay hamesha main method me kam krege hum.
	//isme hameha IO Exception ata h to its neccessary to use try catch block for that.
public class CreateFile54 {
	
	public static void main(String[] args) 
	{ //jaha file bnana h uski location dalna h. or har isme double slash lagana h 
	  //uske bad m file ka nam dena pdega.
		File f=new File("C:\\Users\\Yash\\Desktop\\Yash.txt");
		try
		{
			if(f.createNewFile()) //ye mthod new file bnata h.
			{ //file agr nhi ho to create ho jaegi
				System.out.println("File Successfully Created. ");
			}
			else
			{ //file agr already hogi to y msg aega
				System.out.println("File Already Exists");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled...");
		}
		//or isko hum bina exception handling k bhi handle kr skte h. 
		// public static void main(String[] args) throws IOException iske through
		//ye use krne k bad me hum try catch block ko remove kr skte h.
		
	}
}
