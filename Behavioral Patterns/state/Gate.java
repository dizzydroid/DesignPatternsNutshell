public class Gate {
    private GateState state;

    public Gate() {
        // Initial state is Closed
        state = new ClosedState();
    }

    public void setState(GateState state) {
        this.state = state;
    }

    public void userEnter() {
        state.userEnter(this);
    }

    public void swipeCardOk() {
        state.swipeCardOk(this);
    }

    public void swipeCardNotOk() {
        state.swipeCardNotOk(this);
    }
}
