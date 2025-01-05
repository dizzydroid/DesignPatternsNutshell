public class TestObjectPool {
    public static void main(String[] args) {
        ObjectPool pool = new ObjectPool();

        // Retrieve objects from the pool
        Reusable obj1 = pool.getObject();
        Reusable obj2 = pool.getObject();

        // Use the objects
        obj1.use();
        obj2.use();

        // Return objects to the pool
        pool.releaseObject(obj1);
        pool.releaseObject(obj2);

        // Retrieve objects again (reuse)
        Reusable obj3 = pool.getObject();
        obj3.use();

        // Get a new object when pool is not empty
        Reusable obj4 = pool.getObject();
        obj4.use();
    }
}
