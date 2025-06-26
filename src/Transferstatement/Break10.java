package Transferstatement;

import java.util.Iterator;

public class Break10 {
	public static void main(String[] args) {
//		This will print 1 to 10
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+" ");
//		}
		
		 //break at 7 
		for(int i=1;i<=10;i++) {
			if(i==7) {
				break;
			}
			System.out.println(i+" ");
		}
	}
}