package me.kktrkkt.effectivejava._15_minimize_access_classes_and_member.class_and_interface;

// MemberRepository는 내부용 클래스이고 DefaultMemberService에서만 사용하므로 private static 클래스로 선언해 중첩시켜준다
class DefaultMemberService implements MemberService {

    private final MemberRepository memberRepository;

    DefaultMemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
