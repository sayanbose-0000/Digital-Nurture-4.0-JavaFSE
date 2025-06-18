class Logger {
  private static Logger logger = new Logger(); // instantiating in same class

  private Logger() {}; // private constructor

  public static Logger getInstanceLogger() {
    return logger;
  }
}

class LoggerMainTest {
  public static void main(String[] args) {
    Logger l1 = Logger.getInstanceLogger();
    Logger l2 = Logger.getInstanceLogger();

    System.out.println(l1 == l2 ? "Same instance" : "Different instances");
    System.out.println("1st instance " + l1 + " 2nd instance: " + l2);
  }
}

// Output
// ======
// $ java LoggerMainTest
// Same instance
// 1st instance Logger@372f7a8d 2nd instance: Logger@372f7a8d