package me.kktrkkt.effectivejava._1_static_factory_method._5_advantage;

//import me.kktrkkt.foodserviceinterface.FoodService;

import java.util.ServiceLoader;

public class App {

    // 구현체를 import 하지않고 인터페이스만으로만 호출해서 사용할 수 있다.
    public static void main(String[] args) {
//        ServiceLoader.load(FoodService.class).findFirst().ifPresent(x-> System.out.println(x.serve()));
    }
}
