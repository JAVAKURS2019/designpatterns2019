public class Singleton {
    private Singleton instance;

    private Singleton(){};

    public  Singleton createSingleton(){
        if(this.instance == null){
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}
