public class Plane implements Colleague {
    private String name;
    private Mediator mediator;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + ": Sending message: " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
