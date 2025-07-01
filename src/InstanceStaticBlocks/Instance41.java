package InstanceStaticBlocks;

public class Instance41 {
	//default block constructor se bhi pehle call hota h
	Instance41(){
		System.out.println("Default Constructor");
	}
	
	{	//this is an instane block 
		//instance block cant be accessed without an object
		System.out.println("Diksha");
	}
	
	public static void main(String[] args) {
		Instance41 r=new Instance41(); 
	}
}