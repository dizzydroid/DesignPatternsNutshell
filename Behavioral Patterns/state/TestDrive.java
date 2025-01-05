public class TestDrive {
    public static void main(String[] args) {
        Gate gate = new Gate();

        // Start testing transitions
        System.out.println("Initial State: Closed");
        gate.userEnter(); // Access denied
        gate.swipeCardOk(); // Opens gate
        gate.userEnter(); // Enters and gate closes
        gate.swipeCardNotOk(); // Access denied
        gate.swipeCardOk(); // Opens gate
        gate.swipeCardNotOk(); // Gate already open
    }
}
