public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        amplifier.turnOn();
        amplifier.setVolume(5);
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
        projector.turnOn();
        projector.setInput("DVD");
        System.out.println("Movie is ready to play. Enjoy!");
    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        projector.turnOff();
        dvdPlayer.turnOff();
        amplifier.turnOff();
        System.out.println("Movie theater is shut down.");
    }
}
