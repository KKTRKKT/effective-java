package me.kktrkkt.effectivejava._15_minimize_access_classes_and_member.class_and_interface;

// private static으로 선언한 중첩 클래스는 외부 클래스의 참조를 가지지 않는다.
class ImproveDefaultMemberService implements MemberService {

    private static class MemberRepository {

    }
}
