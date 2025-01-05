public class ForecastDisplay implements Observer {
    private float lastPressure;
    private float currentPressure = 29.92f;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same.");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather.");
        }
    }
}
