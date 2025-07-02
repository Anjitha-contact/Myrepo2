package inheritance;

public class Singlechild extends Singleparent{
	
	public void show()
	{
		System.out.println("show this");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Singlechild obj=new Singlechild();
		//obj.show();
		//obj.display();
		Singleparent obj1=new Singleparent();
		obj1.display();
		//we cannot get the parent class  
	}

}
