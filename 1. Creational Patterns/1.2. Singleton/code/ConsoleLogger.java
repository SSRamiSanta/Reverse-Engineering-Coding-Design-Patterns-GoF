public class ConsoleLogger implements Logger {

	private static ConsoleLogger logger;
	private static ConsoleLogger logger1;

	  //Prevent clients from using the constructor
	  private ConsoleLogger() {
	  }

	  public static ConsoleLogger getConsoleLogger() {
	    if (logger == null) {
	      logger = new ConsoleLogger();
	    }
	    return logger;
	  }

	  public static ConsoleLogger getConsoleLogger1() {
	    if (logger1 == null) {
	      logger1 = new ConsoleLogger();
	    }
	    return logger1;
	  }

	  public synchronized void log(String msg) {
		  System.out.println(msg);
	  }

	}
	
 
