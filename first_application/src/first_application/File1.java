package first_application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class File1 {

	static String Folder_Path="D:\\";
	public static void main(String[] args) {
		
		try {
			Files a;
			 System.out.println("Please enetr file name");
			Scanner sc=new Scanner(System.in);
			String file_name=sc.nextLine();
		File f=new File(Folder_Path+file_name);
		boolean b=f.createNewFile();
		boolean c=f.delete();
		System.out.println("file created "+b);
		System.out.println("file deleted "+c);
		
		FileInputStream fi=new FileInputStream(f);
	
		System.out.println((char)(fi.read()));
		
		
		}catch(Exception e) {
			
			
		}

	}

}
