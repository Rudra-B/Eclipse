package option2;

import java.io.File;
import java.io.FileNotFoundException;

import application.Lockers;
import exception_package.BusinessException;
import utility.Object_util;

public class DeleteOption22 {

	public void option22() throws FileNotFoundException {

		File f = Object_util.file();
		String s[] = f.list();
		
		System.out.println("Please enter the file name to delete\n");
		String file = Object_util.input().nextLine();
		file = file + ".txt";
		File d = new File(Lockers.path + "\\Root\\" + file);
		boolean b=false;
		for(String a:s)
		{
			if(a.equals(file))
			{
				b=d.delete();
			}
		}

		if (b==true) {
			System.out.println("Successfully deleted file = " + file);
		} else {
			throw new BusinessException("Unable to delete File, Please try again\n");
		}

	}

}
