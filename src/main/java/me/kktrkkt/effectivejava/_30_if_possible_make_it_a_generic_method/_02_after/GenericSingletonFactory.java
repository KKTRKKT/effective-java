package me.kktrkkt.effectivejava._30_if_possible_make_it_a_generic_method._02_after;

import java.util.function.Function;
import java.util.function.UnaryOperator;

// 제네릭 싱글톤 팩토리
// 같은 객체를 제네릭 타입에 따라 타입캐스팅해 반환하는 방법으로 메모리 효율적이다
public class GenericSingletonFactory {

    private static final UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    private static <T> UnaryOperator<T> getFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static void main(String[] args) {
        Function<String, String> fs = getFunction();
        System.out.println(fs.apply("a"));
        System.out.println(fs.apply("b"));

        Function<Integer, Integer> fi = getFunction();
        System.out.println(fi.apply(1));
        System.out.println(fi.apply(2));
    }

}
