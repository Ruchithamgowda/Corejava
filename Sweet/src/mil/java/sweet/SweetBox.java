package mil.java.sweet;

public class SweetBox {
    public SweetBox(Sweet sweet) {
        System.out.println("SweetBox is opened.");
        sweet.taste();
    }

    public void displayQuantity() {
        System.out.println("There are 12 sweets in the box.");
    }
}
