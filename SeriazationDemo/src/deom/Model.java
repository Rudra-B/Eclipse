package deom;

import java.io.Serializable;

public class Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4994409606841904705L;
	private String name;
	private String password;
	private String number;
	public Model(String name, String password, String number) {
		
		this.name = name;
		this.password = password;
		this.number = number;
	}
	
	

	@Override
	public String toString() {
		
		return name+"  "+password+"  "+number;
		
		
	}
}
