package mil.java.body;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        HumanBody body = new HumanBody(kidney);
        body.function();
    }
}
