public class MushroomFactory extends PowerUpFactory {
    @Override
    public PowerUp createPowerUp() {
        return new Mushroom();
    }
}
