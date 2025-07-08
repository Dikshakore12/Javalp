package Collections;
import java.util.ArrayDeque;

public class Queue4 
{
	public static void main(String[] args) 
	{
		ArrayDeque<String> Name=new ArrayDeque<>(); //FIFO
		//adding an element in Queue
		Name.add("Yash"); //add() for adding an element
		Name.add("AK");
		Name.add("Dk");
		System.out.println(Name);
		
		Name.removeLast(); ////remove() for removing an element
		System.out.println(Name); //this will delete the dk cause LIFO
		
		
	}
}

