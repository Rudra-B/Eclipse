package multithreading_pack;

public class Test {

	public static void main(String[] args) {
		
		
		Resource rc=new Resource();
		ThreadClass t1=new ThreadClass(rc);
		ThreadClass t2=new ThreadClass(rc);
		t1.setName("first");
		t2.setName("second");
		
		t1.start();
		t2.start();
	}

}
