package by.tc.task01.service;

public class ServiceException extends Exception{
	
	public ServiceException (Exception w) {
		super(w);
	}
	public ServiceException() {
		super();
	}

	public ServiceException(String report) {
		super(report);
	}

	public ServiceException(String report, Exception w) {
		super(report, w);
	}
	
	

}
