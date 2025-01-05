public class Main {
    public static void main(String[] args) {
        // Create chain
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        // Set chain order
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        // Test Add operation
        Numbers addRequest = new Numbers(4, 2, "add");
        chainCalc1.calculate(addRequest);

        // Test Subtract operation
        Numbers subRequest = new Numbers(10, 5, "sub");
        chainCalc1.calculate(subRequest);

        // Test Multiply operation
        Numbers multRequest = new Numbers(3, 4, "mult");
        chainCalc1.calculate(multRequest);

        // Test Divide operation
        Numbers divRequest = new Numbers(20, 4, "div");
        chainCalc1.calculate(divRequest);

        // Test Unsupported operation
        Numbers unsupportedRequest = new Numbers(5, 3, "mod");
        chainCalc1.calculate(unsupportedRequest);
    }
}
