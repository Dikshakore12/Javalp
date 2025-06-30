package This;

public class This40 {
	
	This40()
	{
		this(10); //this will call parametrized const in default const		
	}
	
	This40(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		This40 r=new This40();
	}
}