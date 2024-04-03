package org.example.movieBooking;

public class BookService {
    public TicketBookConfirm bookTicket(Ticket ticket){
        int ticketCost=200;
      double totalTicketPrice=  ticket.quntity*ticketCost;

      TicketBookConfirm ticketBookConfirm=new TicketBookConfirm();
      ticketBookConfirm.movieName="";
      ticketBookConfirm.scanCode="AAA";
      ticketBookConfirm.row=ticket.row;
      ticketBookConfirm.seatNumber=ticket.seat;

      return ticketBookConfirm;

    }
}
