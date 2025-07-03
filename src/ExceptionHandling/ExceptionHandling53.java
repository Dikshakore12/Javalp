package ExceptionHandling;

public class ExceptionHandling53
{
	public static void main(String[] args) 
	{
		//This code will give an error
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at ExceptionHandling.ExceptionHandling53.main(ExceptionHandling53.java:10)

		/*		System.out.println("Main method started ");
		int a=10, b=0,c;
		c=a/b; //c=10/0 which is not possible
		System.out.println(c);
		
		System.out.println("main method ended");
		*/
		System.out.println("Main method started ");
		int a=10, b=0,c;
		try 
		{
			c=a/b; //c=10/0 which is not possible
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);//yha apne man ka msg bhi de skte h ex
		  //System.out.println("Cannot divide by zero");
		}
		System.out.println("main method ended");
	}
}
