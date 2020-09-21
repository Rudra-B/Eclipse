import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Fileip {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		try(FileInputStream fs=new FileInputStream("ani.txt");
				BufferedInputStream bi=new BufferedInputStream(fs))
		{
			
			while(bi.available()!=0)
			{
				sb.append((char)bi.read());
			}
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(sb);

	}

}
