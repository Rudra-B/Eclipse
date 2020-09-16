package application;

import java.util.Scanner;

public class Object_util {
	
	private Object_util() {
		
	}
	static private Scanner sc;

	public static Scanner input() {
		sc=new Scanner(System.in);
		return sc;
	}
}
