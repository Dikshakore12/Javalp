package Collections;

import java.util.ArrayList;
public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> Name=new ArrayList<String>();//ye directly use hoga kyoki predef h.
		//adding an element in array
		Name.add("Yash");//add() is an predef method of above class
		Name.add("AK");
		Name.add("Dk");
		System.out.println(Name);
		Name.add("Anish");//new arr element
		System.out.println(Name);
		
		//by using this way every element will be added at the last 
		//but we want that ki ankit k bad rohit add ho.
		Name.add("Diksha");
		System.out.println(Name);
		//now add om at the beginning
		Name.add("Om");
		System.out.println(Name);
		
		//removing an element in array
		Name.remove("Yash");
		Name.remove(1);
		System.out.println(Name);
		
		//Removing an array element
		//replace Rohit with shilpa
		Name.set(2,"Shilpa");
		System.out.println(Name);
		
		//printing an particular value and print DK
		Name.get(2);
		System.out.println(Name.get(2));
		
		//Deleting an entire array at once
		Name.clear();
		System.out.println(Name);
		
	}
}
//Note:- 
/* This can be any type of not only String
 * ArrayList<String> Name=new ArrayList<String>(); 
 * ArrayList<Type> variableName = new ArrayList<Type>();
 * ArrayList<Integer> numbers = new ArrayList<Integer>();
 * ArrayList<Double> marks = new ArrayList<Double>();
 * ArrayList<Student> students = new ArrayList<Student>();
 * ArrayList<Boolean> flags = new ArrayList<Boolean>();
 */