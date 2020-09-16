import java.util.Arrays;

public class Str {

	public static void main(String[] args) {
		String a="hello making all last character capital";
		StringBuffer sb=new StringBuffer();
		Character z='l';
		
		
		String s[]=a.split(" ");

		
		for(String q:s) 
		{
		 sb.append(q.substring(0, (q.length()-1))).append(Character.toUpperCase(q.charAt(q.length()-1))).append(" ");
		//System.out.println(sb);
		}
		
		System.out.println(sb);
		//int i=0;
//		for(String p:s)
//		{
//			if(p.equals("how"))
//			{
//				System.out.println("given word is present at = "+i);
//			}
//			i++;
//		}

	}

}
