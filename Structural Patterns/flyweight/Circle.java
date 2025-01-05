public class Circle implements Shapes {
    private String color; // Intrinsic state

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, String color) {
        System.out.println("Drawing Circle with color: " + this.color + " at (" + x + ", " + y + ")");
    }
}
