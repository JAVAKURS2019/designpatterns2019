public class LazySingleton {

private static LazySingleton instance;

private LazySingleton(){}

private LazySingleton getInstance() {
    if (instance == null) {
        instance = new LazySingleton();
    }
    return instance;
    }
}
