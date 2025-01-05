public class Square implements Figure {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visit(this);
    }
}
