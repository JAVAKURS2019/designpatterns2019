package cwiczenia;

public class SingletonGoska1 {
    public static final SingletonGoska1 instance = new SingletonGoska1();

    private SingletonGoska1() {
    }

    public static SingletonGoska1 getInstance() {
        return instance;
    }
}
