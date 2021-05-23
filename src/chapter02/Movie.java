package chapter02;

import java.time.Duration;

public class Movie {
  private String title;
  private Duration runningTime;
  private Money fee;
  private DiscountPolicy discountPolicy;

  public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.discountPolicy = discountPolicy;
  }

  public Money getFee(){
    return fee;
  }

  public Money calculateMovieFee(Screening screening){
//    if(discountPolicy == null) { //책임의 위치를 결정하기위해 조건문을 사용하는 것은 협력의 설계 측면에서 대부분 좋지 않은 선택이다. 항상 예외케이스를 최소화하고 일관성을 유지할 수 있는 방법을 선택해야한다.
//      return fee;
//    }
    return fee.minus(discountPolicy.calculateDiscountAmount(screening));
  }
}
