public class Main {
    public static void main(String[] args) {
        // Resources
        Resource artist = new Artist("John Doe");
        Resource song = new Song("Imagine");
        Resource album = new Album("Greatest Hits");

        // Views with different resources
        View compactArtistView = new CompactView(artist);
        View wideSongView = new WideView(song);
        View detailedAlbumView = new DetailedView(album);

        // Display views
        compactArtistView.display(); // Compact View: Artist: John Doe
        wideSongView.display();      // Wide View: Song: Imagine
        detailedAlbumView.display(); // Detailed View: Album: Greatest Hits
    }
}
