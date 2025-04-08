package mil.java.smoke;

public class Smoke {
    public Smoke(Cigratte cigratte) {
        System.out.println("Smoke is being generated...");
        cigratte.burn();
    }

    public void smell() {
        System.out.println("The smell of smoke spreads in the air.");
    }
}
