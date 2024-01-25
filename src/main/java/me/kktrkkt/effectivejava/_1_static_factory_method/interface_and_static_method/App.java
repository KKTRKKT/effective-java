package me.kktrkkt.effectivejava._1_static_factory_method.interface_and_static_method;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        Comparator<Integer> c = (o1, o2) -> o2 - o1;
        numbers.sort(c);
        numbers.forEach(System.out::println);
        // reversed 메소드는 default 메소드다
        numbers.sort(c.reversed());
        numbers.forEach(System.out::println);
    }
}
