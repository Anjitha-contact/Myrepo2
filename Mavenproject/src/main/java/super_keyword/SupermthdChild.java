package super_keyword;

public class SupermthdChild extends SupermthdParent{
	public void show()
	{
		this.saw();
		super.show();
		super.display();
		System.out.println("show");
	}
	public void saw()
	{
	System.out.println("hello");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupermthdChild obj=new SupermthdChild();
		//obj.display();
		obj.show();
	}

}
