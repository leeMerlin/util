public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){

    }

public static Singleton getInstance(){
        return instance;
}
public void  showmessage(){
    System.out.println("Hello World");
    }
}