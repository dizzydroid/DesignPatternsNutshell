public class KoopaFactory extends ObstacleFactory {
    @Override
    public Obstacle createObstacle() {
        return new Koopa();
    }
}
