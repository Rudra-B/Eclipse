import java.io.File; 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collect {

	public static void main(String[] args) {
     int ctr[] =new int[256];
     String s="rudrappa";
     int max;
    for(int i=0;i<s.length();i++)
    {
    	ctr[s.charAt(i)]++;
    }
    
    for(int a:ctr)
    {
    	System.out.println(a);
    }
     
		
	}

}
