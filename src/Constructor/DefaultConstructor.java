package Constructor;

public class DefaultConstructor {

	int a; String b; boolean c;
	DefaultConstructor(){
		a=10; b="Diksha"; c=true;
	}
	void Display() {
		System.out.println(a+" "+b+" "+c);
	}
	
}
class A{
	public static void main(String[] args) {
		DefaultConstructor d=new DefaultConstructor();
		d.Display();
	}
}
