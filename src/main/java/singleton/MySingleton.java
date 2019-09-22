package singleton;

public class MySingleton {


    private static MySingleton instance;

    private MySingleton() {
    }

    static {
        try {
            instance = new MySingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception!!! Sorry!");
        }
    }

    public static MySingleton getInstance() {
        return instance;

    }
}


