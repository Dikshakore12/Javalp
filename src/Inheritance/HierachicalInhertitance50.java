package Inheritance;

public class HierachicalInhertitance50 
{
	void input()
	{
		System.out.println("Enter Your Name :");
	}
}
class Hi1 extends HierachicalInhertitance50
{
	void show()
	{
		System.out.println("My Name is : Diksha");
	}
}
class Hi2 extends HierachicalInhertitance50
{
	void disp()
	{
		System.out.println("My Name is : Kore");
	}
}
class Hi3
{
	public static void main(String[] args) {
		Hi1 hi1=new Hi1();
		Hi2 hi2=new Hi2();
		hi1.input();
		hi1.show();
		hi1.input();
		hi2.disp();
	}
}