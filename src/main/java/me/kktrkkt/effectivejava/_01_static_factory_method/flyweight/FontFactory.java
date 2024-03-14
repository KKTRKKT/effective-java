package me.kktrkkt.effectivejava._01_static_factory_method.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {


    private static final Map<String, Font> fontMap = new HashMap();

    // 속성들을 키로 저장해 같은 속성들이 들어오면 맵에 저장하고 재사용한다
    public static Font of(FontFamily fontFamily, int fontSize) {
        String key = fontFamily.name() + fontSize;

        if(!fontMap.containsKey(key)){
            fontMap.put(key, new Font(fontFamily, fontSize));
        }

        return fontMap.get(key);
    }

}
