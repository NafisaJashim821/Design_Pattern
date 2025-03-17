package template;

public class Main {
    public static void main(String[] args) {
        Game ga = new Cricket();
        ga.startPlay();
        ga.endPlay();
        ga.initialize();
        Game g1 = new Football();
        g1.initialize();
        g1.startPlay();
        g1.endPlay();
    }
}
