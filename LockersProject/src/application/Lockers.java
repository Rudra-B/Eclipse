package application;


import java.util.TreeSet;

import option2.Option2;

public class Lockers {
	
	static {
		
		System.out.println("           Lockers.com");
		System.out.println("                      Developed by:Rudra");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	

	public static void main(String[] args) {
		

		int flag=0;
        Main_Disp mn=new Main_Disp();
        Option2 op2 = new Option2();
        TreeSet<String> set=new TreeSet<String>();
        Option1 op1=new Option1();
		
		
		again:
		do{
			
			mn.display();
			//taking input
			String option=Object_util.input().nextLine();
		
		if(option.equals("1"))
	    {
				
				op1.option1(set);
				flag=1;
				continue again;
		}
		else if(option.equals("2"))
		{
			
			op2.option2(set);
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
