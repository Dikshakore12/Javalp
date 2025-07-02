package Abstraction;
//interface ka har variable public + static + final
//hota hai
interface vehical
{
	String Name="TVS"; //public + static + final
	int Speed=100; //public + static + final
	
	void start();// har method by default public + abstract hota h
	void stop();//public + abstract 
	default void color()
	{
		System.out.println("TVS color is red");
	}
	static void rpm() //this can be called without object
	{
		System.out.println("TVS rpm is 100rpm");
	}
}

class Interface46 implements vehical{
	@Override
	public void start()
	{
		//variable is final because customer cannot change it
		//ex Name = "Honda"; then it will give an error
		System.out.println("start(): insert key & press start button"+Name);
	}
	@Override
	public void stop()
	{
		System.out.println("stop(): exit key");
	}
	
	public static void main(String[] args) {
		Interface46 o=new Interface46();
		o.start(); o.stop(); o.color();
		vehical.rpm();//this can be called without object
		System.out.println(Speed);
	}
}