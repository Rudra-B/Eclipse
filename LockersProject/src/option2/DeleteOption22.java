package option2;

import java.io.File;
import java.io.FileOutputStream;

import application.Object_util;

public class DeleteOption22 {
	
	
	public void option22() {
		
		System.out.println("Please enter the file you want to delete");
		String file=Object_util.input().nextLine();
		
		
		File f=new File("D:\\File_op\\");
		File d=new File("D:\\File_op\\"+file);
		String s[]=f.list();
		boolean b=false;
       for(String q:s) {
			
			if(q.equals(file)) {
			    d.delete();
			    b=true;
				break;
			} 
       }
		if(b)
		{
			System.out.println("Successfully deleted file = "+file);
		}
		else
		{
			System.out.println("Unable to delete file please try again");
		}
		
		
		
		System.out.println("Press Enter to continue");
		Object_util.input().nextLine();
	}

}
