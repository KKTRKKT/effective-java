package me.kktrkkt.effectivejava._01_static_factory_method.service_provider_framework.bridge_pattern;

public class Sword extends DefaultWeapon {

    public Sword(Enchantment enchantment) {
        super(enchantment, "Sword");
    }
}
