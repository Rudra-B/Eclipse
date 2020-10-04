package option2;

import java.io.File;

import utility.Object_util;

public class SearchOption23 {

	void option23() {
		File f = Object_util.file();
		System.out.println("Enter file name to search\n");
		String file = Object_util.input().nextLine();
		file = file + ".txt";

		String s[] = f.list();
		boolean b = false;
		for (String k : s) {
			if (k.equals(file)) {
				System.out.println("Entered file present in Directory\n");
				b = true;
			}
		}

		if (b == false) {
			System.out.println("Entered file not presentt in Directory\n");
		}

	}

}
