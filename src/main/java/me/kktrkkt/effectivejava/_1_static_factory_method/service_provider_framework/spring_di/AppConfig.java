package me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.spring_di;

import me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.bridge_pattern.Enchantment;
import me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.bridge_pattern.FireEnchantment;
import me.kktrkkt.effectivejava._1_static_factory_method.service_provider_framework.bridge_pattern.IceEnchantment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration과 @Bean 애노테이션은 서비스 등록 API라고 볼 수 있다.
@Configuration
public class AppConfig {

    @Bean
    public Enchantment fireEnchantment(){
        return new FireEnchantment();
    }

    @Bean
    public Enchantment iceEnchantment(){
        return new IceEnchantment();
    }
}
