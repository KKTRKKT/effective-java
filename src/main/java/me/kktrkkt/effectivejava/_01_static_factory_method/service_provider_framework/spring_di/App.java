package me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.spring_di;

import me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.bridge_pattern.Enchantment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // getBean이 서비스 접근 API라고 볼 수 있다
        Enchantment fireEnchantment = applicationContext.getBean("fireEnchantment", Enchantment.class);
        Enchantment iceEnchantment = applicationContext.getBean("iceEnchantment", Enchantment.class);
        iceEnchantment.apply();
        fireEnchantment.apply();
    }
}
