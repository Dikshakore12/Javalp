package Multithreading;

//Multithreading me hum ye nhi bol skte ki op kis sequence me aega
//isme jitne time hum thread execute krenge utne time alg output aega
public class Multithreading63 extends Thread 
{
	@Override //is method ko throws exception ki madad se hum handle nhi kr skte
	//this is an predefined method in thread class
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("diksha");
				Thread.sleep(1000); //this 1000 is milisecond value which means that 1sec
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
	//working with user defined mthod 
//	public void fun()
//	{
//		try
//		{
//			for(int i=1;i<=5;i++)
//			{
//				System.out.println("AK");
//				Thread.sleep(1000); //this 1000 is milisecond value which means that 1sec
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//	}
}
class Multithread 
{
	public static void main(String[] args) throws Exception //yha exception jvm handle krega
	{
		Multithreading63 m=new Multithreading63();
		m.start(); //goal is to print 5 times name
		//m.fun(); //not directly start instead name of the method will be there
		for(int i=1;i<5;i++)
		{
			System.out.println("kore");
		}
		Thread.sleep(1000);
	}
}
//Q When to use jb hum chahte h ki output thoda delay me print ho ek ek second ka interupt aye to use sleep method line 12