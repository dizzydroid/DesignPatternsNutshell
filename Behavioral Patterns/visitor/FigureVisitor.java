public interface FigureVisitor {
    void visit(Circle circle);
    void visit(Triangle triangle);
    void visit(Square square);
}
