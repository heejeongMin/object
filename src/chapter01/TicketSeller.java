package chapter01;

public class TicketSeller {

  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

//  public TicketOffice getTicketOffice(){
//    return ticketOffice;
//  }

  //audience가 초대장을 가지고 있는지 티켓을 가지고 있는지 ticketseller는 모름.
  // 어떤 방식으로든지 지불한 대가를 받고 티켓을주기만 하면됨.
  public void sellTo(Audience audience) {
    Long amount = audience.buy(ticketOffice.getTicket());
    ticketOffice.plusAmount(amount);
  }
}
