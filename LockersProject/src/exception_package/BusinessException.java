package exception_package;

import java.io.FileNotFoundException;

public class BusinessException extends FileNotFoundException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BusinessException(String msg)
	{
		super(msg);
	}
	
	

}
