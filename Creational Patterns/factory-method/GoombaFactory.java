public class GoombaFactory extends ObstacleFactory {
    @Override
    public Obstacle createObstacle() {
        return new Goomba();
    }
}
