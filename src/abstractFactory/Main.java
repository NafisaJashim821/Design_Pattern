package abstractFactory;

public class Main {
    public static void main(String[] args) {
        Restaurant orientalRestaurant = new OrientalRestaurant();
        Restaurant classicRestaurant = new ClassicRestaurant();

        Pizza classicPizza = classicRestaurant.createPizza();
        Burger classicBurger = classicRestaurant.createBurger();
        Pizza orientalPizza = orientalRestaurant.createPizza();
        Burger orientalBurger = orientalRestaurant.createBurger();

        classicBurger.prepare();
        classicPizza.bake();
        orientalBurger.prepare();
        orientalPizza.bake();
    }
}

