package multithreading_pack;

public class ThreadClass extends Thread {
	Resource rc;
	
	public ThreadClass(Resource rc) {
		this.rc=rc;
	}
	
	
	@Override
	public void  run() {
		
		rc.resource();
		
		
	}
}
