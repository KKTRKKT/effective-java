package me.kktrkkt.effectivejava._1_static_factory_method._2_advantage;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings(){}

    private static final Settings SETTINGS = new Settings();

    // 미리 생성해놓은 인스턴스를 반환한다
    static public Settings newInstance() {
        return SETTINGS;
    }

}
