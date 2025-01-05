public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly(); // "I'm flying!!"
        mallard.performQuack(); // "Quack"

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly(); // "I can't fly"
        rubber.performQuack(); // "Squeak"

        // Dynamically change behavior
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly(); // "I'm flying!!"
    }
}
