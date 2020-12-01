package adapter;

public class Phone {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(220);
        int i = adapter.changeTo5();
        System.out.println(i);
    }
}
