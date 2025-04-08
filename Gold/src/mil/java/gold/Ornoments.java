package mil.java.gold;

public class Ornoments {
        public Ornoments(Gold gold) {
            System.out.println("Running constructor in Ornoments");
            gold.carat();
        }

        public void chain() {
            System.out.println("Running in chain method in Ornoments");
        }
    }