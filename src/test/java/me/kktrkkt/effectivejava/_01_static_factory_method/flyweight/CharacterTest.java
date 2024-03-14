package me.kktrkkt.effectivejava._01_static_factory_method.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void name() {
        Character java = new Character("java", "black", FontFactory.of(FontFamily.SANS, 11));
        Character spring = new Character("spring", "white", FontFactory.of(FontFamily.SANS, 11));

        System.out.println(java.getFont());
        System.out.println(spring.getFont());

        assertEquals(java.getFont(), spring.getFont());
    }
}