public class Main {
    public static void main(String[] args) {
        Mediator atc = new AirTrafficController();

        Plane plane1 = new Plane("Flight 101");
        Plane plane2 = new Plane("Flight 202");

        plane1.setMediator(atc);
        plane2.setMediator(atc);

        atc.registerColleague(plane1);
        atc.registerColleague(plane2);

        plane1.sendMessage("Requesting clearance for landing.");
        plane2.sendMessage("Requesting clearance for takeoff.");
    }