public class Airline {
        String airlineName;
        String destination;
        String departure;
        int flightNumber;
        int totalSeats;
        int bookedSeats;
        double ticketPrice;
        boolean isInternational;
        String aircraftType;
        String airlineCode;

        public Airline() {
            this("Indigo", "New York", "Los Angeles", 101, 180, 50, 499.99, true, "Boeing 737", "IN001");
        }

        public Airline(String airlineName, String destination) {
            this(airlineName, destination, "Mumbai", 102, 200, 100, 599.99, true, "Airbus A320", "IN002");
        }

        public Airline(String airlineName, String destination, String departure, int flightNumber) {
            this(airlineName, destination, departure, flightNumber, 220, 120, 699.99, true, "Boeing 777", "IN003");
        }

        public Airline(String airlineName, String destination, String departure, int flightNumber, int totalSeats, int bookedSeats, double ticketPrice) {
            this(airlineName, destination, departure, flightNumber, totalSeats, bookedSeats, ticketPrice, false, "Airbus A380", "IN004");
        }

        public Airline(String airlineName, String destination, String departure,int flightNumber, int totalSeats, int bookedSeats, double ticketPrice, boolean isInternational, String aircraftType, String airlineCode) {
            this.airlineName = airlineName;
            this.destination = destination;
            this.departure = departure;
            this.flightNumber = flightNumber;
            this.totalSeats = totalSeats;
            this.bookedSeats = bookedSeats;
            this.ticketPrice = ticketPrice;
            this.isInternational = isInternational;
            this.aircraftType = aircraftType;
            this.airlineCode = airlineCode;
        }

        public void displayDetails() {
            System.out.println("Airline: " + airlineName +
                    "\nDestination: " + destination +
                    "\nDeparture: " + departure +
                    "\nFlight Number: " + flightNumber +
                    "\nTotal Seats: " + totalSeats +
                    "\nBooked Seats: " + bookedSeats +
                    "\nTicket Price: $" + ticketPrice +
                    "\nInternational: " + isInternational +
                    "\nAircraft Type: " + aircraftType +
                    "\nAirline Code: " + airlineCode);
            System.out.println("--------------------------------");
        }

        public static void main(String[] args) {
            Airline a1 = new Airline();
            Airline a2 = new Airline("Emirates", "Dubai");
            Airline a3 = new Airline("Qatar Airways", "London", "Doha", 203);
            Airline a4 = new Airline("Singapore Airlines", "Tokyo", "Singapore", 304, 300, 150, 899.99);
            Airline a5 = new Airline("Lufthansa", "Frankfurt", "Berlin", 405, 250, 200, 749.99, true, "Boeing 787", "LH505");

            a1.displayDetails();
            a2.displayDetails();
            a3.displayDetails();
            a4.displayDetails();
            a5.displayDetails();
        }
    }