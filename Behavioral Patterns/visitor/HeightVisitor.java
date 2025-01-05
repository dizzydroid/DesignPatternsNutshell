public class HeightVisitor implements FigureVisitor {
    private double totalHeight = 0.0;

    public double getTotalHeight() {
        return totalHeight;
    }

    @Override
    public void visit(Circle circle) {
        totalHeight += 2 * circle.getRadius();
    }

    @Override
    public void visit(Triangle triangle) {
        totalHeight += triangle.getHeight();
    }

    @Override
    public void visit(Square square) {
        totalHeight += square.getLength();
    }
}
