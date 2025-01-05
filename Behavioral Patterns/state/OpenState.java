public class OpenState implements GateState {
    @Override
    public void userEnter(Gate gate) {
        System.out.println("Welcome! You entered through the open gate.");
        gate.setState(new ClosedState());
    }

    @Override
    public void swipeCardOk(Gate gate) {
        System.out.println("The gate is already open.");
    }

    @Override
    public void swipeCardNotOk(Gate gate) {
        System.out.println("The gate is already open.");
    }
}
