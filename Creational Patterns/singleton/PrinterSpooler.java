public class PrinterSpooler {

    // Option 1: Thread-safe eager initialization
    private static final PrinterSpooler instance = new PrinterSpooler();

    // Uncomment the following for lazy initialization with synchronized method
    // private static PrinterSpooler instance;

    // Private constructor to prevent instantiation
    private PrinterSpooler() {
        System.out.println("PrinterSpooler instance created.");
    }

    // Option 1: Eager initialization
    public static PrinterSpooler getInstance() {
        return instance;
    }

    /*
    // Option 2: Lazy initialization with synchronization
    public static synchronized PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }
    */

    // A method to simulate adding a print job
    public void addPrintJob(String job) {
        System.out.println("Adding print job: " + job);
    }
}
