package Class;

public class ClassPersonB28 {
	//Class Person
	
	//defining some properties or some common properties
	int age=21;
	int weight=56;
	String color="whitesh";
	
	//defining behavior using methods 
	//behavior will be defined using methods
	void eat() {
		System.out.println("I'm Eating");
	}
	void sleep() {
		System.out.println("I'm Sleeping");
	}
	
	//All this is a virtual part which can be accessed through object.
	public static void main(String[] args) {

		ClassPersonB28 P=new ClassPersonB28();
		//Accessing the data
		System.out.println(P.age);
		System.out.println(P.weight);
		System.out.println(P.color);
		
//		Accessing the behavior
		P.eat(); P.sleep();
		
		
	}
}