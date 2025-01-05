public class Triangle implements Figure {
    private double height;

    public Triangle(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visit(this);
    }
}
