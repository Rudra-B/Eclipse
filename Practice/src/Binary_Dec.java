
public class Binary_Dec {

	public static void main(String[] args) {
		
		Binary_Dec bi=new Binary_Dec();
		bi.bintodec("01010111");
		

	}
	
	
	
	void bintodec(String s)
	{
		int convert=1;
		int result=0;
		for(int i=1;i<=s.length();i++)
		{
			if(s.charAt((s.length()-i))== '1') {
				
				result +=convert;
			}
			
			convert *=2;
		}
		System.out.println(result);
	}

}
