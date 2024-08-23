package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    // @return 할인 대상 금액 : 1000원 할인 됐다. 얼마 할인 됐는지 return
    int discount(Member member, int price);
}
