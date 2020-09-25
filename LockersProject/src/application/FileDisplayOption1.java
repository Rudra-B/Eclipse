package application;

import java.io.File;
import java.util.Arrays;

public class FileDisplayOption1 {

	public void option1() {

		File file = Object_util.file();

		String s[] = file.list();
		// need to add sorting technique
		Arrays.sort(s);

		if (s.length == 0) {
			System.out.println("No files present in Directory");

		} else {
			System.out.println("Files present in Directory");
			System.out.println("------------------------------------");
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
		}

	}

}
