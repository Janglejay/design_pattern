package decorator;

public class Test {
    public static void main(String[] args) {
        Drink drink = new SimpleCoffee();
        System.out.println(drink.getCost());
        System.out.println(drink.getDescription());
        drink = new Chocolate(drink);
        System.out.println(drink.getCost());
        System.out.println(drink.getDescription());
    }
}
