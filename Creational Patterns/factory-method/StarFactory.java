public class StarFactory extends PowerUpFactory {
    @Override
    public PowerUp createPowerUp() {
        return new Star();
    }
}
