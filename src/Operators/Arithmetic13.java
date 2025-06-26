package Operators;

import java.util.Scanner;

public class Arithmetic13 {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any two numbers :");
		
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();

		//addition
		c=a+b;
		System.out.println("a+b :"+c);
		
		//substraction
		c=a-b;
		System.out.println("substraction a-b :"+c);
				
		//Multiplication
		c=a*b;
		System.out.println("Multiplication a*b :"+c);
				
		//Division
		c=a/b;
		System.out.println("Division a/b :"+c);
		
		//addition
		c=a%b;
		System.out.println("Modulus a%b :"+c);
				
	}
}
