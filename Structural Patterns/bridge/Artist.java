public class Artist implements Resource {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Artist: " + name;
    }
}
