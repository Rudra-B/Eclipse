package application;

import option2.FileMenuOption2;

public class Lockers {
	public static final String path = System.getProperty("user.dir");
	static {

		System.out.println("           Welcome to LockedMe.com version 1.0.0");
		System.out.println("_________________________________________________________");
		System.out.println("                                       Developed by:Rudra");
		System.out.println("");
		System.out.println("");
	}

	public static void main(String[] args) {

		int flag = 0;
		Main_Disp mn = new Main_Disp();
		FileMenuOption2 fileMenuOption2 = new FileMenuOption2();
		FileDisplayOption1 fileDisplayOption1 = new FileDisplayOption1();

		do {

			mn.display();
			// taking input
			String option = Object_util.input().nextLine();

			if (option.equals("1")) {

				fileDisplayOption1.option1();
				flag = 1;

			} else if (option.equals("2")) {

				fileMenuOption2.option2();
				flag = 1;

			} else if (option.equals("3")) {

				System.out.println("Thank you!");
				break;

			} else {
				System.out.println("You have Entered wrong option, Please select correct Option");

				flag = 1;

			}
		} while (flag == 1);

	}

}
