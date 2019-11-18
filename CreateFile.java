/*
This program show how to create new file and some common methods
Made by:Yogesh Kumar
*/

import java.io.*;

public class CreateFile {
public static void main(String[] args)throws IOException
{
	File f=new File("file.txt");
	if(!f.exists())
		f.createNewFile();
	System.out.println("File Exist:"+f.exists());
	System.out.println("File name:"+f.getName());
	System.out.println("File length:"+f.length());
	System.out.println("File delete:"+f.delete());
	System.out.println("File Exist:"+f.exists());
}
}
