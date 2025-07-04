package Multithreading;

public class Multithreading64 implements Runnable{
	public void run()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println("My child thread");
		}
	}
}
class Multithreadd 
{
	public static void main(String[] args) 
	{
		Multithreading64 md=new Multithreading64();
		
		Thread t=new Thread(md);
		t.start();
		for(int i=1; i<=5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}