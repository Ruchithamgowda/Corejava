package mil.java.rain;

public class Rain {
    public Rain(Umbrella umbrella) {
        System.out.println("Rain has started falling...");
        umbrella.open(); // Call method from Umbrella
    }

    public void intensity() {
        System.out.println("The rain intensity is moderate.");
    }
}
