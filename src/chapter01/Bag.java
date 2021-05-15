package chapter01;

public class Bag {
  private Long amount;
  private Invitation invitation;
  private Ticket ticket;


  public Long hold (Ticket ticket){
    Long fee = 0L;
    if (!hasInvitation()) {
      fee = ticket.getFee();
      minusAmount(fee); // 고객의 돈이 없을 수도 있는데 그러한 예외처리가 필요
    }
    setTicket(ticket);
    return fee;
  }

  public boolean hasInvitation(){
    return invitation != null;
  }

  public boolean hasTicket(){
    return ticket != null;
  }

  public void setTicket(Ticket ticket){
    this.ticket = ticket;
  }

  public void minusAmount(Long amount){
    this.amount -= amount;
  }

  public void plusAmount(Long amount){
    this.amount += amount;
  }

  public Bag(long amount){
    this(null, amount);
  }

  public Bag(Invitation invitation, long amount){
    this.invitation = invitation;
    this.amount = amount;
  }
}
