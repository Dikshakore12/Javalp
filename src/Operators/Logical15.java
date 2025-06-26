package Operators;

import java.util.Scanner;

public class Logical15 {
	//logical
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter any two numbers :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(a>b && a>b);
		System.out.println(a<b || a>b);
		System.out.println(!(a>b));
	}
}