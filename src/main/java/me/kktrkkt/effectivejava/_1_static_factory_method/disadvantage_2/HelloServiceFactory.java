package me.kktrkkt.effectivejava._1_static_factory_method.disadvantage_2;

import me.kktrkkt.effectivejava._1_static_factory_method.advantage_3_4.EnglishHelloService;
import me.kktrkkt.effectivejava._1_static_factory_method.advantage_3_4.HelloService;
import me.kktrkkt.effectivejava._1_static_factory_method.advantage_3_4.KoreanHelloService;

/**
 * 이 클래스의 인스턴스는 #getEnglishHelloService() 또는 #getKoreanHelloService() 통해 사용한다.
 * @see #getEnglishHelloService() {@link #getKoreanHelloService()}
 */
public class HelloServiceFactory {

    public static HelloService getEnglishHelloService(){
        return new EnglishHelloService();
    }

    public static HelloService getKoreanHelloService(){
        return new KoreanHelloService();
    }
}
