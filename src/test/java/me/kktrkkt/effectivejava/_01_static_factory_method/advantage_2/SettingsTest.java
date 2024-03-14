package me.kktrkkt.effectivejava._01_static_factory_method.advantage_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettingsTest {

    @DisplayName("생성자가 인스턴스를 하나만 생성하는지 확인")
    @Test
    void newInstanceTest() {
        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();
        Settings settings3 = Settings.newInstance();

        System.out.println(settings1);
        System.out.println(settings2);
        System.out.println(settings3);

        assertEquals(settings1, settings2);
        assertEquals(settings2, settings3);
    }
}