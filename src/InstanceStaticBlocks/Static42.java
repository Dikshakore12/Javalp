package InstanceStaticBlocks;
	
public class Static42 {
	//only accesses static variable 
	int a=10; static int b=20;
	static {	//static
		System.out.println("Diksha kore");
		System.out.println(b);
//		System.out.println(a); //this will give an error because it's not an static variable    
	}
	public static void main(String[] args) {
		
	}
}