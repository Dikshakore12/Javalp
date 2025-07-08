package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedList1 {
	public static void main(String[] args) 
	//the main diff betn array list and linkedlist is that 
	// in array element is stored in an array format but in
	//isme element doubly linked list k form m bnega
	{
		
		LinkedList<String> Name=new LinkedList<String>();//ye directly use hoga kyoki predef h.
		//adding an element in array
		Name.add("Yash");//add() is an predef method of above class
		Name.add("AK");
		Name.add("Dk");
		System.out.println(Name);
		
		//add the element at the beggining
		Name.addFirst("Shalini");
		System.out.println(Name);
		
		//add the element at the end
		// but as a professional use Name.addLast("Ajay"); 
		Name.add("Ajay");
		System.out.println(Name);
		
		//add the element at desired location
		Name.add(2,"Madhvi");
		
		//remove the element
		Name.remove(); //removes the element from the begining
		System.out.println(Name);
		
		//Remove AK
		Name.remove(1);
		System.out.println(Name);
		//Remove the begining element
		Name.removeFirst();
//		System.out.println(Name);
		//use for each loop also 
		for(String str:Name)//this wil print line by line instead of print in a row
		{
			System.out.println(str);
		}
		
	}
}
