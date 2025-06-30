package Super;
	
class E{
	E(){
		System.out.println("This is super constructor");
	}
}
class F extends E{
	F() //(int a) this is an parametrized const.
	{
		//super
		System.out.println("This is sub class constructor");
	}
}

 class AccessSuperConstructor36 {
	public static void main(String[] args) {
		F r=new F();
		
	}
}
/*this will print both because in the case of default constructor the first line is reserved 
 * for default constructor
  like B(){ super(); which will automatically given by compiler
*/
/* but if we make parameterized constructor
 *  E(int a;) line9 then it will show an error 
 */
/*	we have to initialize 
	super() keyword by our own *
	like shown in line no 11 commented.  

*/ 
/*/
/*
package Super;

class E{
	E(int a){
		System.out.println("This is super constructor"+a);
	}
}
class F extends E{
	F() //(int a;) this is an parametrized const.
	{
		super(100);
		System.out.println("This is sub class constructor");
	}
}

public class AccessSuperConstructor35 {
	public static void main(String[] args) {
		F r=new F();
		
	}
}
*/