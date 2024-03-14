package me.kktrkkt.effectivejava._1_static_factory_method.reflection;

import me.kktrkkt.effectivejava._1_static_factory_method.advantage_3_4.HelloService;

import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("me.kktrkkt.effectivejava._1_static_factory_method.advantage_3_4.KoreanHelloService");
        HelloService helloService = (HelloService) aClass.getConstructor().newInstance();
        helloService.hello();
    }
}
