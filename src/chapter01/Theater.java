package chapter01;

public class Theater {

  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller){
    this.ticketSeller = ticketSeller;
  }

  //ticketSeller라는 인터페이스에게 위임함으로써 영화관은 더 이상 ticketOffice에 관여하지 않음으로 결합도를 낮춤.
  public void enter(Audience audience){
    ticketSeller.sellTo(audience);
  }
}
