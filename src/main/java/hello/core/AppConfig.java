package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OderServiceImpl;
import hello.core.order.OrderService;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OderServiceImpl(memberRepository(), discountPolicy());
    }

    private FixDiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
