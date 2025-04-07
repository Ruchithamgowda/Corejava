public class Property {
        private String ownerName;
        private String location;
        private double price;

        public Property(String ownerName, String location, double price) {
            this.ownerName = ownerName;
            this.location = location;
            this.price = price;
        }

        public void displayProperty() {
            System.out.println("Owner: " + ownerName);
            System.out.println("Location: " + location);
            System.out.println("Price: $" + price);
            System.out.println("----------------------------");
        }
    }