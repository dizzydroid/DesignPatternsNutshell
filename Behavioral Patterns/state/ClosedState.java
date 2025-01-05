public class ClosedState implements GateState {
    @Override
    public void userEnter(Gate gate) {
        System.out.println("Access denied: The gate is closed.");
    }

    @Override
    public void swipeCardOk(Gate gate) {
        System.out.println("Access granted: The gate is now open.");
        gate.setState(new OpenState());
    }

    @Override
    public void swipeCardNotOk(Gate gate) {
        System.out.println("Access denied: Invalid card.");
    }
}
