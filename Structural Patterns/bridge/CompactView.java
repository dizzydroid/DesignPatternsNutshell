public class CompactView extends View {
    public CompactView(Resource resource) {
        super(resource);
    }

    @Override
    public void display() {
        System.out.println("Compact View: " + resource.getInfo());
    }
}
