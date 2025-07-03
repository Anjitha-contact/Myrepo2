package super_keyword;

public class SupervariableChild extends SupervariableParent {
 String color ="yellow";
 public void display()
 {
	 System.out.println(super.color);
 }
 
	public static void main(String[] args) {
		SupervariableChild  obj=new SupervariableChild();
		System.out.println(obj.color);
		obj.display();
	}

}
