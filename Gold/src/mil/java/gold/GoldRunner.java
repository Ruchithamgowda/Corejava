package mil.java.gold;

public class GoldRunner {
        public static void main(String[] args) {
            Gold gold = new Gold();
            Ornoments ornoments = new Ornoments(gold);
            ornoments.chain();
        }
    }