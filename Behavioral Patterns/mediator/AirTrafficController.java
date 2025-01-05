import java.util.ArrayList;
import java.util.List;

public class AirTrafficController implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(Colleague colleague, String message) {
        for (Colleague c : colleagues) {
            if (c != colleague) {
                c.receiveMessage(message);
            }
        }
    }
}
