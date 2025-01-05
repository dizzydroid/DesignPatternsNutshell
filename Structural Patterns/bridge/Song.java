public class Song implements Resource {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    @Override
    public String getInfo() {
        return "Song: " + title;
    }
}
