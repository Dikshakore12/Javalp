package Strings;

public class Strings26 {
	public static void main(String[] args) {
		//Strings Declaration
		String name="Diksha";
		System.out.println(name);
		//or
		String str = new String("Abc");
		System.out.println(str);
		
		//String Methods 
		
		//length
		int l=str.length();  //use int while using length
		System.out.println(l);
		
		//Lower Case
		String lower= "LOWER";
		lower = lower.toLowerCase();
		System.out.println(lower);
		
		//Upper Case
		System.out.println(str.toUpperCase());
		
		//Concatenation: can concatenate strings using + operator:
		String str1 = "String1"; 
		String str2 = "String2";
		String concatanate= str1+str2;
		System.out.println(concatanate);
		
		//Equals or not using if else - String Comparison
		if(str1 == str2) {
			System.out.println("Both are Equals");
		}else {
			System.out.println("Not Equals");
		}
		
		//Equals or not using - String Comparison
		str1.equals(str2);
		
		//Sub String
		String originalstr = "Yash";
		String substring = originalstr.substring(2); 

	}
}
