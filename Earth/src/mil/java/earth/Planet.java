package mil.java.earth;

public class Planet {
    public Planet(Earth earth) {
      System.out.println("Planet constructor is running...");
        earth.rotate();
}

public void supportLife() {
    System.out.println("Earth supports life with water, air, and sunlight.");
}
}
