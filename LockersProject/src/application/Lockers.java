package application;



import option2.FileMenuOption2;
 
public class Lockers {
	
	static {
		
		System.out.println("           Welcome to DigiFile version 1.0.0");
		System.out.println("_________________________________________________________");
		System.out.println("                                       Developed by:Rudra");
		System.out.println("");
		System.out.println("");
	}
	

	public static void main(String[] args) {
		

		int flag=0;
        Main_Disp mn=new Main_Disp();
        FileMenuOption2 op2 = new FileMenuOption2();
        Option1 op1=new Option1();
		
		
		again:
		do{
			
			mn.display();
			//taking input
			String option=Object_util.input().nextLine();
		
		if(option.equals("1"))
	    {
				
				op1.option1();
				flag=1;
				continue again;
		}
		else if(option.equals("2"))
		{
			
			op2.option2();
			flag=1;
			continue again;
			
		}
        else if(option.equals("3"))
        {
        	
        	System.out.println("Thank you!");
        	System.exit(0);
        	
		}
        else
        {
        	System.out.println("You have Entered wrong option, Please select correct Option");
        	
        	  flag=1;
        	  continue again;
        	
        }
        }while(flag==1);
	

	}

}
