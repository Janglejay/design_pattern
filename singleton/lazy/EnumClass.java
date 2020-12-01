package singleton.lazy;

enum Instance {
    INSTANCE;

    Instance(){
        System.out.println("hello");
    }
}
public class EnumClass {
    public static void main(String[] args) {
        System.out.println(Instance.valueOf(Instance.class, "INSTANCE"));
        System.out.println(Instance.INSTANCE);
        System.out.println(Instance.INSTANCE);
    }
}
