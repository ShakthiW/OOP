public class Tickets {
    private String ticketID;
    private static int ticketCount;

    public Tickets(String ticketID) {
        this.ticketID = ticketID;
        ticketCount++;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public static int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }
}
