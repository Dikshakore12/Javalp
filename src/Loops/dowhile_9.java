package Loops;

import java.util.Scanner;

public class dowhile_9 {
	public static void main(String[] args) {
		int inpVal;
		System.out.println("Enter Val :");
		
		Scanner s=new Scanner(System.in);
		inpVal = s.nextInt();
		
		do{
			System.out.println("the num is :"+inpVal);
			inpVal++;
		}
		while(inpVal<=10);
	}
}