package application;

import java.io.File;

import option2.FileDisplayOption1;
import option2.FileMenuOption2;
import option2.Main_Disp;
import utility.Object_util;

public class Lockers {
	public static final String path = System.getProperty("user.dir");
	static {

		System.out.println("           Welcome to LockedMe.com version 1.0.1");
		System.out.println("---------------------------------------------------------");
		System.out.println("                                       Developed by:Rudra");
		System.out.println("");
		System.out.println("");
	}

	public static void main(String[] args) {

		int flag = 1;
		Main_Disp mn = new Main_Disp();
		FileMenuOption2 fileMenuOption2 = new FileMenuOption2();
		FileDisplayOption1 fileDisplayOption1 = new FileDisplayOption1();
		File f=Object_util.file();
		
		if(!f.isDirectory())
		{
			f.mkdir();
		}
		

		do {

			mn.display();
			
			// taking input from the user
			String option = Object_util.input().nextLine();

			if (option.equals("1")) {

				fileDisplayOption1.option1();

			} else if (option.equals("2")) {

				fileMenuOption2.option2();

			} else if (option.equals("3")) {

				System.out.println("Thank you!");
				break;

			} else {
				System.out.println("You have Entered wrong option, Please select correct Option");

			}
		} while (flag == 1);

	}

}
