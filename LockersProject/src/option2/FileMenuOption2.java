package option2;



import application.Object_util;

public class FileMenuOption2 {
	
	public int option2() {
	
	
	
	AddOption21 op21 =new AddOption21();
	DeleteOption22 op22 =new DeleteOption22();
	SearchOption23 op23 =new SearchOption23();
	int flag=0;
	
	
	again:
	do{
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
			continue again;
	}
	else if(option.equals("2"))
	{
		op22.option22();
		flag=1;
		continue again;
	}
	else if(option.equals("3"))
    {
    	
		op23.option23();
		flag=1;
		continue again;
	}
    else if(option.equals("4"))
    {
    	
    	break;
    	
	}
    else
    {
    	System.out.println("You have Entered wrong option, Please select correct Option");
    	
    	  flag=1;
    	  continue again;
    	
    }
    }while(flag==1);

return 1;
}}