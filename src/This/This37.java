package This;

//This refers to an current object
public class This37 {
	void show() { //this will also show the same result as it's shown by reference variable r
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		This37 r=new This37(); //this is ab obj or yaha isko 
		//reference variable r refer kr rha h.
		
		System.out.println(r); //this will print an class's unique id or number	 
		r.show();
		
		
	}
}