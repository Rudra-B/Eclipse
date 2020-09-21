package deom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerializ {

	
	public static void main(String[] args) {
	 
		Model md=new Model("anil","8095991805","wonder@321");
		try(FileOutputStream fo=new FileOutputStream("zak.txt");
				ObjectOutputStream ob=new ObjectOutputStream(fo)){
			
			ob.writeObject(md);
			System.out.println("Object Succesfully stored in file");
		}catch( IOException e)
		{
			System.out.println(e);
		}

	}

}
