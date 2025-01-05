import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void applyVisitor(FigureVisitor visitor) {
        for (Figure figure : figures) {
            figure.accept(visitor);
        }
    }
}
