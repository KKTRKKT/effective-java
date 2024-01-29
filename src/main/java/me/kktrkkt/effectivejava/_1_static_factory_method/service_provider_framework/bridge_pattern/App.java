package me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.bridge_pattern;

public class App {

    public static void main(String[] args) {
        // 브릿지 패턴은 일종의 서비스 제공자 프레임워크라고 볼 수 있다.
        // Enchantment가 서비스 제공자 인터페이스, FireEnchantment와 IceEnchantment가 구현체이다
        Weapon fireSword = new Sword(new FireEnchantment());
        fireSword.swing();
        Weapon iceSword = new Sword(new IceEnchantment());
        iceSword.swing();
    }
}
