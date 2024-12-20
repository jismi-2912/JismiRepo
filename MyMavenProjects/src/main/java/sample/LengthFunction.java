package sample;

public class LengthFunction{

	public static void main(String[] args) {
		
		String name = "java";
		String name2="selenium";
		int leng=name.length();//length
		System.out.println("Length of the string is : "+leng );
		
		// concat
		System.out.println(name.concat(name2));
		// TODO Auto-generated method stub
		//contains
		String s= "My name is jismi";
		System.out.println(s.contains("name"));
		System.out.println(s.contains("baby"));
		
		//equals
		
		String val="java";
		String val2="Java";
		System.out.println(name.equals(val));
		System.out.println(name.equals(val2));
		System.out.println(name.equals(name2));
		
		//equalsignorecase()
		System.out.println(name.equalsIgnoreCase(name2));
		//valueof()
		int a=15;
		String s1=String.valueOf(a);
		
		System.out.println(s1);
		
		//isempty()
		String s2="";
		System.out.println(s2.isEmpty());
		

	}

}
