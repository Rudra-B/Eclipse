package option2;


import java.io.File;
import java.util.TreeSet;

import application.Object_util;

public class Option21 {
	
	public int option21(TreeSet<String> set) {
		
	
	System.out.println("Please Enter file name");
	String f=Object_util.input().nextLine();
	//set.add(file);
	
	File file=new File("D:\\File_op\\"+f);
	try
	{
		if(file.createNewFile())
		{
			System.out.println("file added successfully");
		}
		else {
			System.out.println("unable to create file");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
	
	System.out.println("press enter to continue");
	Object_util.input().nextLine();
	
	return 1;
	}

}
