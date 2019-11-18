/*
This program implements hierarchical Inheritance
Made By:Yogesh Kumar
*/
class GParent{
int i=2341;
void Display()
{
	System.out.println(i);
}
}
class p extends GParent{
}
class C extends GParent{
}
public class HierarchicalInheritance {
	public static void main(String[]args)
	{
		 C c=new C();
		 c.Display();
		 p p=new p();
		 p.Display();
	}
}
