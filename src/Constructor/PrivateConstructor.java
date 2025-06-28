package Constructor;

public class PrivateConstructor {
	
	int a; String b;
	
	private PrivateConstructor() {
		a=60; b="dy";
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		PrivateConstructor p=new PrivateConstructor();//its runnable code 
	}
	}
		//if we want to make another class and run code then its give an error cause we can't use private constructor out of the class 
		//its provide security 
		/*class D{
			public static void main(String[] args) {
				PrivateConstructor p=new PrivateConstructor();//The constructor PrivateConstructor() is not visible
			}
		}*/
		
	


