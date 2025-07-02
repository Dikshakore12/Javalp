package Inheritance;

public class InheritanceMultilevel48 //super
{
	int a,b,c;
	void add()
	{
		a=10; b=20;
		c=a+b;
		System.out.println("Sum of two Numbers: "+c);
	}
	void sub()
	{
		a=200; b=100;
		c=a-b;
		System.out.println("Sub of two Numbers:"+c);
	}
}
class Mi1 extends InheritanceMultilevel48 //sub1
{
	void mul()
	{
		a=10; b=20;
		c=a*b;
		System.out.println("Mul of two Numbers:"+c);
	}
	void div()
	{
		a=10; b=2;
		c=a/b;
		System.out.println("Div of two Numbers:"+c);
	}
}
class Mi2 extends Mi1 //sub2
{
	void modulous()
	{
		a=10; b=20;
		c=a%b;
		System.out.println("Remainder of two Numbers:"+c);
	}
}
class Mi3 extends Mi2{
	public static void main(String[] args) {
		Mi2 n1=new Mi2();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
		n1.modulous();
	}
}