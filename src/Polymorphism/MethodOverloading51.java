package Polymorphism;

public class MethodOverloading51 {
	void add() //1st method
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y) //2nd method
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x, double y) //3rd method
	{
		double c;
		c=x+y;
		System.out.println(c);
	}
}

class Mo1 extends MethodOverloading51
{
	public static void main(String[] args) {
		Mo1 mo=new Mo1();
		//ab method ko call krte smay compiler method k behaviour ko dekh kr smjhe ga ki kb konse method
		//ko execute krna h, like when default it will call the default method
		//when double value method then it will call the 3rd method which has double value data type.
		mo.add(); //this will call the 1st method
		mo.add(100,200);//this will call the 2nd method
		mo.add(50,45.32);//this will call the 3rd method
		
		//now resiprocal the output
		mo.add(50,45.32);//this will call the 3rd method
		mo.add(100,200);//this will call the 2nd method
		mo.add(); //this will call the 1st method
	}
}
