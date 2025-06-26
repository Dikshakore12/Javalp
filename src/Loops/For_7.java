package Loops;

import java.util.Scanner;

public class For_7 {
	public static void main(String[] args) {
		int inpVal,i;
		System.out.println("Enter Value");
		
		Scanner s=new Scanner(System.in);
		inpVal = s.nextInt();
		
		for(i=inpVal;i<=10;i++) { //here inpval will start with desired location
			System.out.println("Ans :"+i);
		}
	}
}
