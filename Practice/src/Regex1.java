
public class Regex1 {

	public static void main(String[] args) {
		String pat="Wond";
		String reg="";
		//^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$
		
		
		
		if(pat.matches(reg)) {
			System.out.println("matches");
		}
	}

}
