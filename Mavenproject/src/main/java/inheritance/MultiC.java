package inheritance;

public class MultiC extends MultiInter {
	public void dis()
	{
		System.out.println("this is a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiC obj1=new MultiC();
		obj1.dis();
		obj1.show();
		obj1.add();
	}

}
