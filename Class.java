/*
This Program Creates a new class and its function 
*/
public class Class {

	int id;
	String name;
	
	void Display()
	{
		System.out.println("Faculty_ID"+id);
		System.out.println("Faculty_Name"+name);
	}

	public static void main(String[]args)
	{
		Class c1=new Class();
		c1.id=2341;
		c1.name="Yogesh";
		c1.Display();	
	}
}
