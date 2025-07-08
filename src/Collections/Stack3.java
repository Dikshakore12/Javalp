package Collections;

import java.util.Stack;

public class Stack3 
{
	public static void main(String[] args) 
	{
		Stack<String> Name=new Stack<String>(); //LIFO
		//adding an element in Stack
		Name.push("Diksha"); //push() for adding an element
		Name.push("Yash");
		Name.push("Dk");
		System.out.println(Name);
		
		Name.pop(); ////pop() for removing an element
		System.out.println(Name); //this will delete the dk cause LIFO
		
		
	}
}
