/*
This program implements multiple Inheritance
Made By:Yogesh Kumar
*/

interface a{
 void printf();
}
interface b{
	 void cout();
	}
class big implements a,b
{

	
	public void cout() {
		System.out.println("cout");
	}

	public void printf() {
		System.out.println("printf");
	}
	public void println() {
		System.out.println("println");
	}
	
}
public class multipleInheritance {
public static void main(String[]args)
{
	big o=new big();
	o.cout();
	o.printf();
	o.println();
}
}
