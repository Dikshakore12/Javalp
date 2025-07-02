package Inheritance;

public class InheritanceSimple47  //super class
{
	int roll, marks;
	String name;
	void input()
	{
		System.out.println("Enter Roll Name & Marks ");
	}
	private void primethod() { //this cannot be accessed using sub class
		System.out.println("yash");
	}
	protected void promethod() { //this can be accessed because it is protected not private.
		System.out.println("protected method");
	}
}
class Students extends InheritanceSimple47 //sub class
{
	void disp()
	{
		roll = 101; name = "Diksha"; marks=80;
		System.out.println(roll+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.input(); //accesing the super class method
		obj.disp(); //accesing the sub class method
	  //obj.primethod();  this will give an error because it is an private method.
		obj.promethod();//but this can be accessed because this is protected not private.	
	}
}