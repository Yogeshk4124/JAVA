/*
This program implements Multilevel Inheritance
Made by:Yogesh Kumar
*/
class GrandParent{
int i=2341;
void Display()
{
	System.out.println(i);
}
}
class parent extends GrandParent{

}
class Child extends parent{

}
public class MultilevelInheritance {

	public static void main(String[]args)
	{
	Child c=new Child();
	c.Display();
	}
}
