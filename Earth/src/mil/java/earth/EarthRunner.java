package mil.java.earth;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Planet planet = new Planet(earth);
        planet.supportLife();
    }
}
