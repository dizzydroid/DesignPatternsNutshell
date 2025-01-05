import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shapes> shapes = new HashMap<>();

    public static Shapes getCircle(String color) {
        Shapes shape = shapes.get(color);

        if (shape == null) {
            shape = new Circle(color);
            shapes.put(color, shape);
            System.out.println("Creating Circle with color: " + color);
        }
        return shape;
    }
}
