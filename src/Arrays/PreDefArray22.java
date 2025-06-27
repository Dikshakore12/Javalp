package Arrays;

public class PreDefArray22 {
	
	public static void main(String[] args) {
		//Compile time array
		int a[]= {10,20,30,40,50};
		System.out.println("Array 3rd element :"+a[2]+"\n");
		
		System.out.println("Full Array :");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
			//another way
		System.out.println("another way");
		for(int b : a) {
			System.out.println(b+" ");
		}
		
	}
}