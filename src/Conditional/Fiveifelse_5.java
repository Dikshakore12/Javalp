package Conditional;
import java.util.Scanner;

public class Fiveifelse_5 {
	
	public static void main(String[] args) {
		
		int password;
		System.out.println("Enter Your Password :"); 
		Scanner enter=new Scanner(System.in); //Taking an input
		password = enter.nextInt(); //Storing an taken value in this
		
		if(password == 322546) {
			System.out.println("Correct Password :");
			System.out.println("Name : Yash");
			System.out.println("Age : 20");
			System.out.println("contact: 1324567987");
		}
		else {
			System.out.println("Wrong Password Try Again !!!!");
		}
		
	}
}