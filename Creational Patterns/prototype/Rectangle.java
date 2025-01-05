public class Rectangle implements Shape {
    private String color;

    public Rectangle(String color) {
        this.color = color;
        System.out.println("Rectangle is Created");
    }

    @Override
    public Shape makeCopy() {
        System.out.println("Rectangle is Being Made");
        Rectangle clonedRectangle = null;
        try {
            clonedRectangle = (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The Rectangle was Turned to Mush");
            e.printStackTrace();
        }
        return clonedRectangle;
    }

    @Override
    public String toString() {
        return "Rectangle color: " + color;
    }
}
