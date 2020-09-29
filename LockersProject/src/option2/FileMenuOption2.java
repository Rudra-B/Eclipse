package option2;



import java.io.FileNotFoundException;

import utility.Object_util;

public class FileMenuOption2 {
	
	public int option2() {
	
	
	
	AddOption21 op21 =new AddOption21();
	DeleteOption22 op22 =new DeleteOption22();
	SearchOption23 op23 =new SearchOption23();
	int flag=0;
	

	do{
		System.out.println("_____________________________________");
		System.out.println("Please select the following option");
		System.out.println("1.Add File");
		System.out.println("2.Delete File");
		System.out.println("3.Search File");
		System.out.println("4.Goto Main Menu ");
		//taking input
		String option=Object_util.input().nextLine();
	
	if(option.equals("1"))
    {
			
			op21.option21();
			flag =1;
	}
	else if(option.equals("2"))
	{
		try {
			op22.option22();
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		flag=1;
	}
	else if(option.equals("3"))
    {
    	
		op23.option23();
		flag=1;
	}
    else if(option.equals("4"))
    {
    	
    	break;
    	
	}
    else
    {
    	System.out.println("You have Entered wrong option, Please select correct Option");
    	
    	  flag=1;	
    }
    }while(flag==1);

return 1;
}}
