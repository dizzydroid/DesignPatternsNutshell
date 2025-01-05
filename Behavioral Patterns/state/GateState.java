public interface GateState {
    void userEnter(Gate gate);
    void swipeCardOk(Gate gate);
    void swipeCardNotOk(Gate gate);
}
