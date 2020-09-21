import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileop {

	public static void main(String[] args) {

        try(FileOutputStream fo=new FileOutputStream("ani.txt");
        		BufferedOutputStream bo=new BufferedOutputStream(fo))
        {
        	String s="Writing data to file";
        	bo.write(s.getBytes());
        	
        }catch( IOException e)
        {
        	System.out.println(e.getMessage());
        }
		
		

	}

}
