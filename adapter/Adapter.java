package adapter;

public class Adapter implements To5 {
    private int voltage = 220;
    public Adapter(int voltage){
        this.voltage = voltage;
    }
    @Override
    public int changeTo5() {
        return 5;
    }
}
