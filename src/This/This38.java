package This;

public class This38 {
	//same name of instance and local variable
	int a; //instance variable
	This38(int a ){//local variable/){
		this.a=a; //here 
	}
	
	
	void show() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		This38 r=new This38(100);
		
		r.show();
	}
}