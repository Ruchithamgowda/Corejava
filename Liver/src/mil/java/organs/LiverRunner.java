package mil.java.organs;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver();
        DigestiveSystem system = new DigestiveSystem(liver);
        system.absorbNutrients();
    }
}
