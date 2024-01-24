package me.kktrkkt.effectivejava._1_static_factory_method.flyweight;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Character {

    // 자주 변하는 속성
    private String value;

    private String color;

    // 자주 변하지 않는 속성 (재사용할 속성)
    private Font font;

    public Character(String value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
