package me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.bridge_pattern;

public class EnchantmentFactory {

    public static Enchantment of(String name) {
        if("ice".equals(name)){
            return new IceEnchantment();
        }
        else if("fire".equals(name)) {
            return new FireEnchantment();
        }
        else {
            return null;
        }
    }

}
