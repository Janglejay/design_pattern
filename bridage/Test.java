package bridage;

public class Test {
    public static void main(String[] args) {
        Phone phone = new FullScreenPhone(new Oneplus());
        Phone phone2 = new DirectScreenPhone(new XiaoMi());
        phone.open();
        phone2.open();
    }
}
