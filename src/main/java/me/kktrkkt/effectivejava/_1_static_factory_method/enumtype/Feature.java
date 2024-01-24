package me.kktrkkt.effectivejava._1_static_factory_method.enumtype;

import java.util.*;

public class Feature {

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        EnumMap<OrderStatus, String> map = new EnumMap<>(OrderStatus.class);
        Set<OrderStatus> set = EnumSet.allOf(OrderStatus.class);
    }
}
