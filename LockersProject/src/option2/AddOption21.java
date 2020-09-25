package option2;

import java.io.File;

import application.Lockers;
import application.Object_util;

public class AddOption21 {

	public void option21() {

		// Reading file name and creating file Object
		String f;
		int flag = 0;
		do {
			flag = 0;
			System.out.println("Please Enter file name");
			f = Object_util.input().nextLine();
			if (!f.matches(".+")) {
				flag = 1;
				System.out.println("File name cannot be empty");
			}

		} while (flag == 1);

		File file = new File(Lockers.path + "\\Root\\" + f + ".txt");
		try {
			if (file.createNewFile()) {
				System.out.println("file added successfully");
			} else {
				System.out.println("unable to create file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
