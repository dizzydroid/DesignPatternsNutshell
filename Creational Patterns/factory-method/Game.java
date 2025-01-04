public class Game {
    public static void main(String[] args) {
        // Create individual factories for each type
        ObstacleFactory goombaFactory = new GoombaFactory();
        ObstacleFactory koopaFactory = new KoopaFactory();
        PowerUpFactory mushroomFactory = new MushroomFactory();
        PowerUpFactory starFactory = new StarFactory();

        // Use factories to create objects
        Obstacle goomba = goombaFactory.createObstacle();
        goomba.render(); // Output: "Goomba obstacle created!"

        Obstacle koopa = koopaFactory.createObstacle();
        koopa.render(); // Output: "Koopa obstacle created!"

        PowerUp mushroom = mushroomFactory.createPowerUp();
        mushroom.activate(); // Output: "Mushroom power-up activated!"

        PowerUp star = starFactory.createPowerUp();
        star.activate(); // Output: "Star power-up activated!"
    }
}
