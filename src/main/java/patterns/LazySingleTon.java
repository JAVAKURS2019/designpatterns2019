package patterns;

public class LazySingleTon {
    public static LazySingleTon instance;
    private LazySingleTon(){}
    public LazySingleTon getInstance() {
        if (instance==null) {
            instance = new LazySingleTon();
        }
        return instance;
    }
}
