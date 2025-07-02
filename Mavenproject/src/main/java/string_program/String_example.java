package string_program;

public class String_example {

	public static void main(String[] args) {
		String x="hai";
		System.out.println(x);
		String a=new String("hello");
		System.out.println(a);
//length
		System.out.println(x.length());
		//add two strings
		System.out.println(x.concat(a));
	System.out.println(x);
	
//contains used to check weather a char present in the string if it is contains true else false 
	String z="hello world";
	System.out.println(z.contains("w"));
	System.out.println(z.contains("f"));
	String d="java";
	String b="Java";
	String e="java";
	String c="Selenium";
	//equalsmcompare wether 2 strings are equals
	System.out.println(z.equals(b));
	System.out.println(d.equals(e));
	//equalsignorecase
	
System.out.println(d.equalsIgnoreCase(b));
System.out.println(d.equals(e));
String p= new String("java");
System.out.println(d.equals(p));
System.out.println(d.equals(e));
System.out.println(d == p); 
// valueof- type conversion- it converts any type to string
int t=124;
System.out.println(String.valueOf(t));
//Isempty -check weather a string is empty or not
System.out.println(b.isEmpty());
String h="";
System.out.println(h.isEmpty());



}
}