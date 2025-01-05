import java.util.Queue;
import java.util.LinkedList;

public class ObjectPool {
    private final Queue<Reusable> availableObjects = new LinkedList<>();
    private int objectCounter = 0;
    private final int MAX_POOL_SIZE = 3;

    // Retrieves an object from the pool
    public Reusable getObject() {
        if (availableObjects.isEmpty()) {
            if (objectCounter < MAX_POOL_SIZE) {
                Reusable newObject = new Reusable(++objectCounter);
                return newObject;
            } else {
                throw new RuntimeException("Max pool size reached. No available objects.");
            }
        }
        return availableObjects.poll();
    }

    // Returns an object back to the pool
    public void releaseObject(Reusable object) {
        System.out.println("Reusable object " + object.getId() + " returned to the pool.");
        availableObjects.offer(object);
    }
}
