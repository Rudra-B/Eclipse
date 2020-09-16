import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Multi {
    //this program is to find count of characters
	public static void main(String[] args) {
		
		String a="i have repetative elements";
		
		char c[];
		c=a.toCharArray();
		Arrays.sort(c);
	char temp[] =new char[13];
	int j=0;
	for( int i=0;i<c.length-1;i++) {
		if(c[i]!=c[i+1])
		{
			temp[j++]=c[i];
				
		}
	}
	temp[j++]=c[(c.length-1)];
	
	System.out.println(temp);
	
	
		for(int k=0;k<temp.length-1;k++)
		{
			int count=0;
			for(int y=0;y<c.length-1;y++) {
				if(temp[k]==c[y])
				{
					count++;
				}
			}
			System.out.println(temp[k]+"repeat time is"+count);
		}
		
		
		
		
		
		

	}

}
