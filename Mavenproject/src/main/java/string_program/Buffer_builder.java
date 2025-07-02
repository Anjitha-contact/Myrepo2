package string_program;

public class Buffer_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a =new StringBuffer("Hello");
System.out.println(a);
StringBuilder b= new StringBuilder("hai");
System.out.println(b);
// insert =to insert new element to particular position
System.out.println(a.insert(5, "world"));//5th position 
System.out.println(b.insert(3, "Anjitha"));
System.out.println(a);
System.out.println(b);
//append - adding new string at the end
System.out.println(a.append("say"));
// repalce -replace a particular value
System.out.println(b.replace(1, 3, "world"));
System.out.println(a.replace(0, 2, "n"));
//reverse-
System.out.println(a.reverse());
// delete
System.out.println(a.delete(1, 3));
System.out.println(a.replace(0, 2, "hai"));


	}

}
