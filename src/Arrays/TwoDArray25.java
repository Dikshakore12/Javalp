package Arrays;

import java.util.Scanner;

//Again Repeat


public class TwoDArray25 {
	public static void main(String[] args) {
		//2D Array
		int a[][]=new int[2][2];
		System.out.println("Enter Array Elemensts :");
		Scanner s=new Scanner(System.in);
	
		for(int i=0; i<2 ;i++)
		{
			for(int j=0; j<2 ;j++) 
			{
				a[i][j]=s.nextInt();
			}
			System.out.println("\nMatrix Elements: ");
		}
		for(int i=0; i<2 ;i++)
		{
			for(int j=0; j<2 ;j++) 
			{
				System.out.print(a[i][j]+" ");;	

			}
				System.out.println();
			}
				
	}
}
