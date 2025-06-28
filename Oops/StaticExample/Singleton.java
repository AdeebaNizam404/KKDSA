package Oops.StaticExample;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        //check weather only one object is created
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
