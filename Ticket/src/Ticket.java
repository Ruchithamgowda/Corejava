public class Ticket {
        private String passengerName;
        private String destination;
        private double price;

        public Ticket(String passengerName, String destination, double price) {
            this.passengerName = passengerName;
            this.destination = destination;
            this.price = price;
        }

        public void displayTicket() {
            System.out.println("Passenger Name: " + passengerName);
            System.out.println("Destination: " + destination);
            System.out.println("Price: $" + price);
            System.out.println("----------------------------");
        }
    }