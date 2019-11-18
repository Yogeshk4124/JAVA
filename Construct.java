/*
This Program demonstrate the working of Constructors
Made By:Yogesh Kumar
*/
public class Construct{
	int uid;
	String name;
		public Construct(int a,String n)
	{
		uid=a;
		name=n;
	}
	 Construct(Construct s)
		{
			uid=s.uid;
			name=s.name;
		}
	Construct()
		{
			uid=0;
			name=(String)null;
		}
		public void Display()
		{
			System.out.println("UID:"+uid+" Name:"+name);
		}
		public static void main (String args[]){
			System.out.println("Parametrized Constructor");
				Construct c1=new Construct(2341,"YogeshKumar");
				c1.Display();
			System.out.println("Copy Constructor");
				Construct c2=c1;
				c2.Display();
			System.out.println("Default Constructor");
				Construct c3=new Construct();
				c3.Display();
		}
}
