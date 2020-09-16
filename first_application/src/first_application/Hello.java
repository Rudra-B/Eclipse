package first_application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Hello implements Serializable {
	
	static int count=0;

	{
		
		count++;
				
	}
	public static void main(String[] args) {
		
		Hello h= new Hello();
		Hello h1= new Hello();
		Hello h2= new Hello();
		
		System.out.println(Hello.count);
		System.out.println(Hello.count);
	
	Scanner sc= new Scanner(System.in);
	//File file=new File("D:\\abc.txt");
	File file=new File("D:\\Hello.ser");
	try {
	file.createNewFile();
	System.out.println(file.getAbsolutePath());
	
		FileOutputStream fos=new FileOutputStream(file, true);
		System.out.println("Please enter data to the file");
		//String txt=sc.nextLine();
		ObjectOutputStream s=new ObjectOutputStream(fos);
		s.writeObject(h);
		//byte[] b =txt.getBytes();
		//fos.write(b);
		s.close();
		System.out.println("file saved succesfully");
	}catch(Exception e) {
		e.printStackTrace();
	}
	

	}

}
