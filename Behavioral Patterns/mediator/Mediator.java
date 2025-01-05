public interface Mediator {
    void registerColleague(Colleague colleague);
    void sendMessage(Colleague colleague, String message);
}
