package mil.java.sweet;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        SweetBox box = new SweetBox(sweet);
        box.displayQuantity();
    }
}
