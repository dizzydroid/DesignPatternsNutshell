public class WideView extends View {
    public WideView(Resource resource) {
        super(resource);
    }

    @Override
    public void display() {
        System.out.println("Wide View: " + resource.getInfo());
    }
}
