public class DetailedView extends View {
    public DetailedView(Resource resource) {
        super(resource);
    }

    @Override
    public void display() {
        System.out.println("Detailed View: " + resource.getInfo());
    }
}
