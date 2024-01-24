package me.kktrkkt.effectivejava._1_static_factory_method.enumtype;

public class Order {

    // 상수로 상태를 설정할 수 있지만 그 외의 값들이 들어갈 수 있기 때문에 검증로직이 필요해진다.
    // private int status = PREPARING;'
    // private final int PREPARING = 0;

    // 열거타입을 사용하면 검증로직이 필요없다
    private OrderStatus orderStatus;
}
