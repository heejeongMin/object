package chapter02;

/**
 * NonDiscountPolicy 라는 새로운 클래스를 추가하여 애플리케이션의 기능을 확장
 */
public class NonDiscountPolicy extends DiscountPolicy {

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
