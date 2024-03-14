package me.kktrkkt.effectivejava._01_static_factory_method.service_provider_framework.bridge_pattern;

public class DefaultWeapon implements Weapon{

    private Enchantment enchantment;

    private String name;

    public DefaultWeapon(Enchantment enchantment, String name) {
        this.enchantment = enchantment;
        this.name = name;
    }

    @Override
    public void swing() {
        System.out.printf("The %s is swung\n", name);
        if(enchantment != null){
            enchantment.apply();
        }
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public void setEnchantment(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
