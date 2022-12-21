public class FileLogger implements Logger {

  private static FileLogger logger;
  private static FileLogger logger1;

  //Prevent clients from using the constructor
  private FileLogger() {
  }

  public static synchronized FileLogger getFileLogger() {
    if (logger == null) {
      logger = new FileLogger();
    }
    return logger;
  }

  public static synchronized FileLogger getFileLogger1() {
    if (logger1 == null) {
      logger1 = new FileLogger();
    }
    return logger1;
  }

  public synchronized void log(String msg) {
    FileUtil futil = new FileUtil();
    futil.writeToFile("log.txt",msg, true, true);
  }

}
