public class Main {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.addFigure(new Circle(5));
        structure.addFigure(new Triangle(10));
        structure.addFigure(new Square(4));

        HeightVisitor heightVisitor = new HeightVisitor();
        structure.applyVisitor(heightVisitor);
        System.out.println("Total Height: " + heightVisitor.getTotalHeight());
    }
}
