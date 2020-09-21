package option2;

import java.io.File;
import application.Object_util;

public class DeleteOption22 {
	
	
	public void option22() {
		
		System.out.println("Please enter the file you want to delete");
		String file=Object_util.input().nextLine();
		
		//set.remove(file);
		File f=new File("D:\\File_op\\"+file);
		boolean b=f.delete();
		
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
