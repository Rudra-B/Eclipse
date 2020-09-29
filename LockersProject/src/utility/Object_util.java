package utility;

import java.io.File;
import java.util.Scanner;

import application.Lockers;

public class Object_util {
	
	private Object_util() {
		
	}
	static private Scanner sc;
	static private File file;

	public static Scanner input() {
		sc=new Scanner(System.in);
		return sc;
	}
	
	public static File file() {
		
		file=new File(Lockers.path+"\\Root");
		
		return file;
	}
}
