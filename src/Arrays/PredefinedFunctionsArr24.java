package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class PredefinedFunctionsArr24 {
	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Enter an Array Elements :");
		
		//Taking an input
		Scanner s=new Scanner(System.in);
		//loop for input
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		//for Sorting an Array
		Arrays.sort(a);
		System.out.println("\nArray Elements :");
		
		//Loop for op
		for(int j:a) {
			System.out.println(j+" ");
		}
	}
}
