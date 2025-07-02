package Inheritance;

//this whole program will give an error from line 
//7 to line 28 because multiple inheritance is 
//not supported using class
/*
public class MultipleInheritance49 
{
	void show() 
	{
	System.out.println("This is class MultipleInheritance49");	
	}
}
class Ml1
{
	void show()
	{
		System.out.println("This is class Ml1");
	}
}
class Ml2 extends Ml1,MultipleInheritance49
{
	public static void main(String[] args)
	{
		Ml2 m=new Ml2();
		m.show();
	}
}
*/

//this program will show when two class have same method 
interface MultipleInheritance49
{
	abstract void show(); //ye by default public+static hota h
}
interface Ml1
{
	abstract void show();//ye bhi same so thats why when calling it use keyword public
}
class Ml2 implements Ml1, MultipleInheritance49
{
	public void show() //yha public use krna pdega
	{
		System.out.println("Interface ML1 & Ml2");
	}
	public static void main(String[] args) {
		Ml2 m=new Ml2();
		m.show();
	}
}

//working with interfaces which having diffrent methods with it.
/*
interface MultipleInheritance49
{
	abstract void show(); //ye by default public+static hota h
}
interface Ml1
{
	abstract void disp();//ye bhi same so thats why when calling it use keyword public
}
class Ml2 implements Ml1, MultipleInheritance49
{
	public void show() //yha public use krna pdega
	{
		System.out.println("Interface ML1");
	}
	public void disp() //yha public use krna pdega
	{
		System.out.println("Interface Ml2");
	}
	public static void main(String[] args) {
		Ml2 m=new Ml2();
		m.show(); m.disp();
	}
}
*/