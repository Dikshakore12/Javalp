package Operators;

import java.util.Scanner;

public class Assignment16 {
	//Assignment Operators
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any two Numbers :");
		
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		//input 10 20
		c=b; 
		System.out.println(c); //20
		
		System.out.println(c+=a); //30 
		System.out.println(c-=b); //10
		System.out.println(c*=a); //100
		System.out.println(c/=b); //5
		System.out.println(c%=a); //5
				
		
	}
}
