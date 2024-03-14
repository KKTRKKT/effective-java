package me.kktrkkt.effectivejava._1_static_factory_method.disadvantage_1;

import me.kktrkkt.effectivejava._1_static_factory_method.advantage_2.Settings;

public class AdvancedSettings  {

    // Settings를 상속대신 프로퍼티에 선언해 사용한다.
    private final Settings settings;

    public AdvancedSettings(Settings settings) {
        this.settings = settings;
    }

    public Settings getSettings() {
        return settings;
    }
}
