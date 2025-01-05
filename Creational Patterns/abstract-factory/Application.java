public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
        createUI();
    }

    private void createUI() {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        // Create a Windows GUI
        GUIFactory winFactory = new WinFactory();
        Application winApp = new Application(winFactory);
        winApp.paint(); // Output: Painting a Windows-style button, checkbox

        // Create a Mac GUI
        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.paint(); // Output: Painting a Mac-style button, checkbox
    }
}
