package Constructor;

public class ParameterizedConstructor {
	
	int a,b;
	  ParameterizedConstructor(int d, int c){
		a=d; b=c;
	}
	void Display() {
		System.out.println(a+" "+b);
	}
	
}
class B{
	public static void main(String[] args) {
		 ParameterizedConstructor d1=new  ParameterizedConstructor(10,20);
		d1.Display();
	}
}


