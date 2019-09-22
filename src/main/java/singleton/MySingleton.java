package singleton;

public class MySingleton {


    private static MySingleton instance;

    private MySingleton(){}
    static{
        try{
            instance = new MySingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static MySingleton getInstance(){
        return instance;
    }
}


