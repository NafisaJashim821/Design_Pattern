package abstractFactory;

public class ClassicPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Classic Pizza...");
    }
}
