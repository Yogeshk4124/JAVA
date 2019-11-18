/*
This program implements Method Overloading
Made by:Yogesh Kumar
*/
public class MethodOverloading {
 static void Display()
{
	System.out.println("Nothing to Display");
}
 static void Display(int i)
{
	System.out.println(i);
}
public static void main(String []args)
{
	Display();
	Display(2);
}
}
