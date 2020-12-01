package bridage;

public abstract class Phone {
    private Brand brand;
    public Phone(Brand brand){
        this.brand = brand;
    }
    protected void open(){
        brand.open();
    }
}
