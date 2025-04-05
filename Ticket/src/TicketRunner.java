public class TicketRunner {
        public static void main(String[] args) {
            Ticket[] tickets = new Ticket[3];

            tickets[0] = new Ticket("Ruchitha Gowda", "Mysore", 150.75);
            tickets[1] = new Ticket("Rachana", "Banglore", 220.50);
            tickets[2] = new Ticket("Appu", "Sullia", 175.00);

            for (Ticket ticket : tickets) {
                ticket.displayTicket();
            }
        }
    }