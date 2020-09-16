import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Word_Count {
    //this program is to find duplicate words number
	public static void main(String[] args) {
		
		String s="need to find number of words present need in this words senetence ";
		String st[]=s.split("\\s");
		int count=0;
		Set<String> sq=new LinkedHashSet<>();
		for(String g:st) {

			System.out.println(g);
			count++;
			sq.add(g);
		}
		
		String z[]=new String[sq.size()];
		int g=0;
		for(String p:sq)
		{
			z[g]=p;
			g++;
		}
		
		
		System.out.println(count);
		System.out.println(sq.size());
		
		
		
		for(int i=0;i<sq.size();i++)
		{
			int cout=0;
			for(int j=0;j<st.length;j++)
			{
				if(z[i].equals(st[j]))
				{
					cout++;
				}
			}
			if(cout>1) {
				System.out.println(z[i]+" is repeated for times"+cout);
			}
			
		}
		

	}

}
