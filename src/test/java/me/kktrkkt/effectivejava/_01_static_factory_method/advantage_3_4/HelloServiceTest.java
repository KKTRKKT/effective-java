package me.kktrkkt.effectivejava._01_static_factory_method.advantage_3_4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @DisplayName("생성자가 하위타입의 객체를 반환하는지 확인")
    @Test
    void createSubTypeTest() {
        HelloService kr = HelloService.of("kr");
        assertEquals(KoreanHelloService.class, kr.getClass());
    }

    @DisplayName("생성자가 매개변수에 따라 다른 객체를 반환하는지 확인")
    @Test
    void createByInputParameterTest() {
        HelloService kr = HelloService.of("kr");
        HelloService en = HelloService.of("en");

        kr.hello();
        en.hello();
    }
}