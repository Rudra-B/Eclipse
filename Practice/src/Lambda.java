
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Lambdaint lam =(source , destination)->
			{
		       System.out.println("Cab Booked Successfully from "+source+" to "+destination);
		       return 777.77;
				
			};
			
			
			
			System.out.println("Price = "+lam.book("Belgaum" , "Banglore"));
	}

}

interface Lambdaint{
	//void book();
	//void book(String source,String destination);
	double book(String source,String destination);
}
