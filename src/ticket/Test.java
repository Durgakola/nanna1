package ticket;

public class Test {
    public static void main(String[] args) {
        TicketBookService ts=new TicketBookService();
       Ticket t= ts.bookTicket(5,"A","10:30","Hanuman");
        System.out.println(t);
    }

}
