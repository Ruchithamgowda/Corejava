package mil.java.organs;

public class DigestiveSystem {
    public DigestiveSystem(Liver liver) {
        System.out.println("Digestive system is working...");
        liver.detoxify();
    }

    public void absorbNutrients() {
        System.out.println("Nutrients are being absorbed by the digestive system.");
    }
}
