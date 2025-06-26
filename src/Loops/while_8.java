package Loops;

import java.util.Scanner;

public class while_8 {
	public static void main(String[] args) {
		int inpVal;
		
		System.out.println("Input :");
		
		Scanner s= new Scanner(System.in);
		inpVal = s.nextInt();
		
		while(inpVal<=10) {
			System.out.println("The Num is : "+inpVal);
			 //inpVal = s.nextInt();
			
			//printed num is even and odds
			if(inpVal % 2 == 0) {
				System.out.println("Even");
			}else {
				System.out.println("odd");
			}
			inpVal++;
		}
		
	}
}
