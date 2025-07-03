package inheritance;

public class Hierac2 extends Hierap1 {
	public void display()
	{
		System.out.println("display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierac2 obj2=new Hierac2();
		obj2.display();
		obj2.parent();
	}

}
