
public class StackCo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImp st=new StackImp();
		
		st.push("ani");
		st.push("res");
		st.push("zak");
		
		st.toString();
		System.out.println("--------------");
		
		st.peek();
		st.pop();
		System.out.println("Stack after poping ");
		
		st.toString();
		st.push("rudra");
		System.out.println("-------------------");
		st.toString();

	}

}
