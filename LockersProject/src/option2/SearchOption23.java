package option2;

import java.io.File;

import utility.Object_util;

public class SearchOption23 {

	void option23() {
		System.out.println("Enter file name to search");
		String file = Object_util.input().nextLine();
		file = file + ".txt";
		File f = Object_util.file();

		String s[] = f.list();
		int flag = 0;
		for (String q : s) {

			if (q.equals(file)) {
				System.out.println("Entered file present in application");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("No file present with enterd name");
		}

	}

}
