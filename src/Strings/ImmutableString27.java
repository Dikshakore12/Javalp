package Strings;

public class ImmutableString27 {
	//String is immutable 
	public static void main(String[] args) {
		String str="Diksha"; //immutable cannot be changed
		
		str.concat(" kore"); //this should change but will not 

		System.out.println(str); //op will be diksha not added with kore
		
		//how to change it 
		//We can do it by cloning it 
		String str2=str.concat(" Kore");
		System.out.println(str2);
		//here it's not changed to str it's point using str2
		//not created new one
	}
}
