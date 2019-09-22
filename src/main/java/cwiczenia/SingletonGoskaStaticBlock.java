package cwiczenia;

public class SingletonGoskaStaticBlock {
    private static final SingletonGoskaStaticBlock instance;

    private SingletonGoskaStaticBlock(){}

    static{
        try{
            instance = new SingletonGoskaStaticBlock();
        }catch(Exception exeption){
            throw new RuntimeException("Singleton static block exception");
        }
    }

    public static SingletonGoskaStaticBlock getInstance() {
        return instance;
    }

}
