package option2;

import java.io.File;

import application.Object_util;

public class Option23 {
	static final String path="D:\\\\File_op\\";
	void option23() {
		System.out.println("Enter file name to search");
		String file=Object_util.input().nextLine();
		File f=new File(path);
		
		String s[]=f.list();
		int flag=0;
		for(String q:s) {
			
			if(q.equals(file)) {
				System.out.println("Entered file present in application");
				flag=1;
				break;
			} 
		}
		if(flag==0) {
			System.out.println("No file present with enterd name");
		}
		
		System.out.println("Press enter to continue");
		Object_util.input().nextLine();
		
	}

}
