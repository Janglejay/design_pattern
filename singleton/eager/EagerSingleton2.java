package singleton.eager;

public class EagerSingleton2 {
    private final static EagerSingleton2 instance;
    static {
        instance = new EagerSingleton2();
    }
    private EagerSingleton2(){}
    public static EagerSingleton2 getInstance(){
        return instance;
    }
}
