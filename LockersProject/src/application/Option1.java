package application;





import java.io.File;
import java.util.TreeSet;

public class Option1 {
	
	public void option1(TreeSet<String> set)
	{
		  
        File  f= new File("D:\\File_op\\");

       String s[] = f.list();
      // System.out.println(s);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("Press enter to continue");
		Object_util.input().nextLine();
		
	}

}
