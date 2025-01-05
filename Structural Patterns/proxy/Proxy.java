public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject(); // Lazy initialization
        }
        System.out.println("Proxy: Logging request before forwarding.");
        realSubject.request();
    }
}
