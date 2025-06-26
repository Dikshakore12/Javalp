package Conditional;
import java.util.Scanner;

public class SixElseIf {

	public static void main(String[] args) {
		//Creating an variable
		int marks;
		System.out.println("Enter Your  Marks :");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		
		if(marks >= 60 && marks <= 100) {
			System.out.println("First Division");
		}else if(marks >= 45 && marks <= 59) {
			System.out.println("Second Division");
		}else if(marks >= 33 && marks < 45) {
			System.out.println("Third Division");
		}else if(marks > 100){
			System.out.println("Invalid Input Plzz Put Marks below 100");
		}else {
			System.out.println("Fail you have to give an exam again !!!");
		}
		
		obj.close();
	
	}
}