package me.kktrkkt.effectivejava._15_minimize_access_classes_and_member.member;

import me.kktrkkt.effectivejava._15_minimize_access_classes_and_member.class_and_interface.MemberService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;

import static org.junit.jupiter.api.Assertions.*;


// ItemService를 생성하기 위해서는 MemberService의 구현체가 필요하다. 구현체를 만드는 2가지 방법이 있다.
// 1. 인라인으로 익명 객체를 만든다.
// 2. Mockito를 통해 가짜 객체를 만든다.
@MockitoSettings
class ItemServiceTest {

    @Mock
    MemberService memberService;

    @Test
    void itemService() {
        final ItemService itemService = new ItemService(memberService);
        assertNotNull(itemService);
        assertNotNull(itemService.getMemberService());
    }
}