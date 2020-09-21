package option2;


import java.io.File; 
import application.Object_util;

public class AddOption21 {
	
	public void option21() {
		
	
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
	
	
	}

}
