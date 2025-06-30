/* SUPER KEYWORD	*/
//Accessing Variables

package Super;

class A 
	{
		int a=10;	//here variable name is same as in class B
	}
class B extends A
{
	int a=20;		//here variable name is same as in class A	
	void show()
	{
    	System.out.println(a); 
    //this will print 20 cause in the main method class b apne variable ko hi priority dega
    // which is sub class variable a=20 //To access super class variable use super keyword 

		System.out.println(super.a); //This is an super keyword	
	}
}

//main method
 class AccessSuperVariable34 {
	public static void main(String[] args)
	{
	B r=new B();
	r.show();
	}
}