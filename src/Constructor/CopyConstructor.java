package Constructor;

public class CopyConstructor {
	 int a; String b; 
	
	CopyConstructor(){
		a=64; b="diksha";
		
		System.out.println(a+" "+b);
	}
		CopyConstructor(CopyConstructor ref){
			a=ref.a;
			b=ref.b;
			System.out.println(a+" "+b);	
			
		}
	}
	class C{
		public static void main(String[] args) {
			CopyConstructor c=new CopyConstructor();
			CopyConstructor c1=new CopyConstructor(c);
		}
	}
	
	


