/*
This Program implements Exception handling
Made By:Yogesh Kumar
*/
public class tryCatch {
public static void main(String[]args)throws ArithmeticException
{
	int a=12,b=0;
	try {
		if(b==0)
			throw new ArithmeticException("Error");
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	finally {
		System.out.print("printed");
	}
}
}
