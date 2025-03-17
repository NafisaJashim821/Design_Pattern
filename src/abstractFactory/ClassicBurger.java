package abstractFactory;

public class ClassicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Classic Burger...");
    }
}
