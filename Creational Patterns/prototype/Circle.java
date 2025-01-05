public class Circle implements Shape {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
        System.out.println("Circle is Created");
    }

    @Override
    public Shape makeCopy() {
        System.out.println("Circle is Being Made");
        Circle clonedCircle = null;
        try {
            clonedCircle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The Circle was Turned to Mush");
            e.printStackTrace();
        }
        return clonedCircle;
    }

    @Override
    public String toString() {
        return "Circle color: " + color + ", radius: " + radius;
    }
}
