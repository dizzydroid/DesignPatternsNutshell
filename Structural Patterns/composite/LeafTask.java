public class LeafTask implements Task {
    private String name;

    public LeafTask(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void complete() {
        System.out.println("Completing leaf task: " + name);
    }
}
