package Super;

class C{
	void show() {
		System.out.println("Hello Diksha1");
	}
}
class D extends C{
	void show() {
		System.out.println("Diksha Hello2"); //this will target local d method 
		//To target C method use super keyword
		super.show(); //class c method
	}
}

 class AccessSuperMethod35 {
	public static void main(String[] args) {
		D r=new D();
		r.show();
	}
}