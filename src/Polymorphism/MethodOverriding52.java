package Polymorphism;
//This program is for when the method is overriden and this will call the method of subclass
public class MethodOverriding52 {
	void draw() //1st method 
	{
		System.out.println("Can't Say Shape Type ");
	}
}
class another extends MethodOverriding52
{
	@Override //jb bhi override method hume pta ho ki override method h to vha ye @Override likh dege.
	//and this indicates this is an overriden method.
	//when jvm comes in super class it will first find if method is there in super class or not
	//if not then it will give an compilation error.
	void draw() //this is an override method
	{
		//super.draw(); //when used this will call the super class mthod in main method.
		System.out.println("Square Shape");
	}
}
//yha upr me humne do class me same name se do methods bnai h, and dono ka behavior alg h.
class demo
{
	public static void main(String args[])
	{
		//isme ab yha jo object bnaege vo object ka refernce hamara super class ka refernce hoga.
		//or object hum bnaege hamare sub class ka Ex;-
		MethodOverriding52 o=new another();
		o.draw();// this will call the subclass method kyoki vo overriden hai.	
		//but if we want to call the method of super class then use super keyword in 
		//super class ex:- super.method_name(); in subclass method.
	}
}


// This program is when the method is not overriden
//and this will call the mehtod of super class
/*
public class MethodOverriding52 
	{
		void draw() //1st method 
		{
			System.out.println("Can't Say Shape Type ");
		}
	}
class another extends MethodOverriding52
{
		void draw1() //this is an override method
		{
		System.out.println("Square Shape");
		}
}
	//yha upr me humne do class me same name se do methods bnai h, and dono ka behavior alg h.
class demo
{
	public static void main(String args[])
	{
	//isme ab yha jo object bnaege vo object ka refernce hamara super class ka refernce hoga.
	//or object hum bnaege hamare sub class ka Ex;-
	MethodOverriding52 o=new another();
	o.draw();// this will call the subclass method kyoki vo overriden hai.	
	}
}
*/ 


