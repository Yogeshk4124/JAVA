/*
This program implements Method Overiding
Made By:Yogesh Kumar
*/

class Par{
void Display()
{
	System.out.println("parent");
}
}
class ch extends Par{
	void Display()
	{
		System.out.println("child");
	}
}
public class MethodOveriding {
public static void main(String[] args)
{
	ch c=new ch();
	c.Display();
}
}
