package Arrays;

import java.util.Scanner;

public class RuntimeInputArr23 {
	public static void main(String[] args) {
		
		int a[]=new int[5];
		System.out.println("Enter Array Elements: ");
		Scanner ss=new Scanner(System.in);
		//Loop for taking an input
		for(int i=0;i<5;i++)  //responsible for input
		{
			a[i]=ss.nextInt();
		}
		System.out.println("\nArray :");
		
		//Loop for printing them
		for(int b:a) {// Responsible for output
			System.out.println(b+" ");
		}
	}
}