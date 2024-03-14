package me.kktrkkt.effectivejava._08_avoid_finalizer_and_cleaner.non_static_inner_has_outer_reference;

import java.util.Arrays;

// 람다에서 외부 객체의 프로퍼티를 참조하는 경우 외부 객체 참조가 생긴다.
// 하지만 value가 static인 경우에는 외부 객체 참조가 생기지 않는다.
public class LambdaExample {

    private int value = 1;

    private Runnable lamda = () -> System.out.println(value);

    public static void main(String[] args) {
        final LambdaExample lambdaExample = new LambdaExample();
        printAllField(lambdaExample.lamda);
    }

    public static void printAllField(Object obj) {
        final Class<?> aClass = obj.getClass();
        Arrays.stream(aClass.getDeclaredFields()).forEach(f->{
            System.out.println("type : " + f.getType().getSimpleName());
            System.out.println("name : " + f.getName());
        });
    }

}
