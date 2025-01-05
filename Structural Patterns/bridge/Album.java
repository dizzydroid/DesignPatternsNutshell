public class Album implements Resource {
    private String title;

    public Album(String title) {
        this.title = title;
    }

    @Override
    public String getInfo() {
        return "Album: " + title;
    }
}
