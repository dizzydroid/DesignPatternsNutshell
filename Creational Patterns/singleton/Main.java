public class Main {
    public static void main(String[] args) {
        // Get the single instance of PrinterSpooler
        PrinterSpooler spooler = PrinterSpooler.getInstance();

        // Add a print job
        spooler.addPrintJob("Print Document 1");

        // Get another reference to the PrinterSpooler instance
        PrinterSpooler anotherSpooler = PrinterSpooler.getInstance();

        // Verify that both references point to the same instance
        System.out.println(spooler == anotherSpooler); // Outputs: true

        // Add another print job
        spooler.addPrintJob("Print Document 2");
    }
}
