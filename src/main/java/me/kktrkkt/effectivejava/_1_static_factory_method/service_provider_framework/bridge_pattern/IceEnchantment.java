package me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.bridge_pattern;

public class IceEnchantment implements Enchantment {

    @Override
    public void apply() {
        System.out.println("the item freezes the enemy");
    }
}
