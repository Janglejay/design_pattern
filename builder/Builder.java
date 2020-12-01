package builder;

public abstract class Builder {

    public abstract Builder buildName(String name);

    public abstract Builder buildHeight(int height);

    public abstract Builder buildPrice(int price);

    public abstract House build();

}
