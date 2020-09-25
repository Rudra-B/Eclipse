package option2;

import java.io.File;

import application.Lockers;
import application.Object_util;

public class DeleteOption22 {

	public void option22() {

		File f = Object_util.file();
		String s[] = f.list();
		System.out.println("Files present in Directory");
		System.out.println("--------------------------");
		for (String q : s) {

			System.out.println(q);

		}

		System.out.println(" ");
		System.out.println("Please enter the file you want to delete");
		String file = Object_util.input().nextLine();
		file = file + ".txt";
		File d = new File(Lockers.path + "\\Root\\" + file);

		if (d.delete() == true) {
			System.out.println("Successfully deleted file = " + file);
		} else {
			System.out.println("Unable to delete file please try again");
		}

	}

}
