package mil.java.body;

public class HumanBody {
    public HumanBody(Kidney kidney) {
        System.out.println("Human body system is working...");
        kidney.filter();
    }

    public void function() {
        System.out.println("All organs are functioning properly.");
    }
}
