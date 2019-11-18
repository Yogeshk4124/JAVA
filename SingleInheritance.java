/*
This Program implements single inheritance
Made by:Yogesh Kumar
*/
class Parent{
int i=2341;
void Display()
{
	System.out.println(i);
}
}
class child extends Parent{
}
public class SingleInheritance {
	public static void main(String[]args)
	{
	child c=new child();
	c.Display();
	}
}
