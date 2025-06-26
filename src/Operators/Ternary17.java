package Operators;

import java.util.Scanner;

public class Ternary17 {
	//Ternary also known as short hand if-else 
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any three numbers :");
		
		//Taking input
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		int r=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(r);
				
	}
	
	
}
