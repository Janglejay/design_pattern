package bridage;

public class DirectScreenPhone extends Phone{

    public DirectScreenPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("directscreen open");
    }
}
