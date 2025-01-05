public class Reusable {
    private final int id;

    public Reusable(int id) {
        this.id = id;
        System.out.println("Reusable object " + id + " created.");
    }

    public void use() {
        System.out.println("Using Reusable object " + id);
    }

    public int getId() {
        return id;
    }
}
