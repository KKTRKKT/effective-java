package me.kktrkkt.effectivejava._20_use_interface_rather_than_abstract;

public class AbstractFlyable implements Flyable {

    @Override
    public String fly() {
        return "날기";
    }
}
