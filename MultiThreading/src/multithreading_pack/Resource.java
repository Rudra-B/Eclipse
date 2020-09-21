package multithreading_pack;

import java.util.LinkedList;

public class Resource {
	
	LinkedList<Integer> ls=new LinkedList<>();
	int cap=2;
	
		public void put() throws InterruptedException
		{
			if(ls.size()==cap)
			{
				wait();
			}
			
			
		}
		
		
		
	

}
