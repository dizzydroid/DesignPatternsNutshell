public class TestCloning {
    public static void main(String[] args) {
        // Create original shapes
        Circle originalCircle = new Circle("Red", 5.0);
        Rectangle originalRectangle = new Rectangle("Blue");

        // Clone the shapes
        Circle clonedCircle = (Circle) originalCircle.makeCopy();
        Rectangle clonedRectangle = (Rectangle) originalRectangle.makeCopy();

        // Output the original and cloned shapes
        System.out.println("Original: " + originalCircle);
        System.out.println("Cloned: " + clonedCircle);

        System.out.println("Original: " + originalRectangle);
        System.out.println("Cloned: " + clonedRectangle);

        // Print hash codes to demonstrate they are different objects
        System.out.println("Original Circle HashCode: " + System.identityHashCode(originalCircle));
        System.out.println("Cloned Circle HashCode: " + System.identityHashCode(clonedCircle));

        System.out.println("Original Rectangle HashCode: " + System.identityHashCode(originalRectangle));
        System.out.println("Cloned Rectangle HashCode: " + System.identityHashCode(clonedRectangle));
    }
}
