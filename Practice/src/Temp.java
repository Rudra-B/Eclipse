import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
	    int num;
	    boolean flag;
		System.out.println("Please enter option");
		
		do {
			flag=false;
		Scanner sc=new Scanner(System.in);
		try {
	    num=Integer.parseInt(sc.nextLine());
		}catch(Exception e)
		{
			System.out.println("Please enter Numbers only");
			flag=true;
		}
		}while(flag!=false);
	    
		
		
		
	
		

	}

}
