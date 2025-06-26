package Operators;

import java.util.Scanner;

public class Relational14 {
	//Relational also known as Comparison
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any 2 numbers :");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
	}
}
