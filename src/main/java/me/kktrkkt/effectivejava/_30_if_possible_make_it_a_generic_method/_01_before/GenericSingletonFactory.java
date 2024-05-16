package me.kktrkkt.effectivejava._30_if_possible_make_it_a_generic_method._01_before;

import java.util.function.Function;

// 싱글톤을 사용하지 않는 제네릭 팩토리
// getFunctionS, getFunctionI는 소거법에 의해 사실 같은 객체를 반환하지만 따로 생성해서 반환하고 있다
public class GenericSingletonFactory {

    private static Function<String, String> getFunctionS() {
        return (f) -> f;
    }

    private static Function<Integer, Integer> getFunctionI() {
        return (f) -> f;
    }

    public static void main(String[] args) {
        Function<String, String> fs = getFunctionS();
        System.out.println(fs.apply("a"));
        System.out.println(fs.apply("b"));

        Function<Integer, Integer> fi = getFunctionI();
        System.out.println(fi.apply(1));
        System.out.println(fi.apply(2));
    }

}
