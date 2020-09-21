package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializ {

	public static void main(String[] args) {
		
		
		try(FileInputStream fs=new FileInputStream("zak.txt");
				ObjectInputStream oi=new ObjectInputStream(fs))
		{
			Model md=(Model)oi.readObject();
			
			System.out.println(md);
		}catch(IOException |ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
