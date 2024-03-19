package me.kktrkkt.effectivejava._15_minimize_access_classes_and_member.member;

import me.kktrkkt.effectivejava._15_minimize_access_classes_and_member.class_and_interface.MemberService;

import java.util.Objects;

// memberService를 테스트에서 사용하기 위해서 package-private 수준의 getter를 제공한다. 또는 memberService를 package-private 수준으로 바꿔준다. ㅇㅇ
public class ItemService {

    private final MemberService memberService;

    long sale;

    protected int saleRate;

    public ItemService(MemberService memberService) {
        if(memberService == null){
            throw new IllegalArgumentException("memberService must be not null.");
        }
        this.memberService = memberService;
    }

    MemberService getMemberService() {
        return memberService;
    }
}
