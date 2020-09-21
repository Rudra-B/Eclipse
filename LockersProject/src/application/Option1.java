package application;

import java.io.File; 

public class Option1 {
	
	public void option1()
	{
		  
        File  f= new File("D:\\File_op\\");

       String s[] = f.list();
      
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("Press enter to continue");
		Object_util.input().nextLine();
		
	}

}
