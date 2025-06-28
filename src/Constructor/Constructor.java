package Constructor;

public class Constructor {

	int empId; String name; //instance variable

	//Constructor
	Constructor(){
		empId=101; name="Diksha"; 
	}
	void show() {
		System.out.println(empId+" "+name);
	}
}

class Constructor29B{
	public static void main(String[] args) {
		Constructor  ref=new Constructor(); //this is an constructor and ref is an reference variable	
		//this will be called automatically while creating an object.
		
		//but we have to call show method()
		ref.show(); //
		
	}
}