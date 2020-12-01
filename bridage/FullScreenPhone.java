package bridage;

public class FullScreenPhone extends Phone {
    public FullScreenPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("fullscreen open");
    }
}
