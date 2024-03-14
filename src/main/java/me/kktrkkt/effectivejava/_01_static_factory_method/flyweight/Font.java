package me.kktrkkt.effectivejava._01_static_factory_method.flyweight;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Font {

    private FontFamily fontFamily;

    private int fontSize;

    public Font(FontFamily fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
