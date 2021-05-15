package chapter01;

public class Audience {
  private Bag bag;

  public Audience(Bag bag){
    this.bag = bag;
  }

//  public Bag getBag(){
//    return bag;
//  }

  public Long buy(Ticket ticket){//Audience가 자기 가방의 티켓/초대장/돈을 직접 관리.
    return bag.hold(ticket);
  }
}
