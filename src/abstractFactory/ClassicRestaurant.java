package abstractFactory;

public class ClassicRestaurant extends Restaurant{
    public Burger createBurger() {
        return new ClassicBurger();
    }

    @Override
    public Pizza createPizza() {
        return new ClassicPizza();
    }
}
