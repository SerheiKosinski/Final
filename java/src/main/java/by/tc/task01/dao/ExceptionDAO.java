package by.tc.task01.dao;

public class ExceptionDAO extends Exception {
	
	  public ExceptionDAO() {
		  super();
	  }

	  public ExceptionDAO(String report) {
		  super(report);
	  }

	  public ExceptionDAO(Exception w) {
		  super(w);
	  }
	
	  public ExceptionDAO(String report, Exception w) {
		  super(report, w);
	}
}
