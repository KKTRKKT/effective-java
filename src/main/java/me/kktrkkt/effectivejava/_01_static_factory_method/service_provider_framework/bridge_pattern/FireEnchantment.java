package me.kktrkkt.effectivejava._01_static_factory_method.service_provider_framework.bridge_pattern;

public class FireEnchantment implements Enchantment {

    @Override
    public void apply() {
        System.out.println("the item sets the enemy on fire");
    }
}
