package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileEx {

	public static void main(String[] args) {
		
		String a=System.getProperty("user.dir");
		
		try {
			//System.getProperty(User.dir");
			System.out.println(a);
			FileOutputStream fs=new FileOutputStream(a+"\\File1\\vabc.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
