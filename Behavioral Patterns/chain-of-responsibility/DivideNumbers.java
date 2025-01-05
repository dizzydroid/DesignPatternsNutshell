public class DivideNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalcWanted().equals("div")) {
            if (request.getNumber2() != 0) {
                System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " +
                    (request.getNumber1() / request.getNumber2()));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Operation not supported: " + request.getCalcWanted());
        }
    }
}
