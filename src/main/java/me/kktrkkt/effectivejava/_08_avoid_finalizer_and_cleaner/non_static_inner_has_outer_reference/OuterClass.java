package me.kktrkkt.effectivejava._08_avoid_finalizer_and_cleaner.non_static_inner_has_outer_reference;

import java.util.Arrays;

public class OuterClass {

    class InnerClass {
    }

    public static void main(String[] args) {
        final OuterClass outerClass = new OuterClass();
        final InnerClass innerClass = outerClass.new InnerClass();
        printAllField(innerClass);
    }

    public static void printAllField(Object obj) {
        final Class<?> aClass = obj.getClass();
        Arrays.stream(aClass.getDeclaredFields()).forEach(f->{
            System.out.println("type : " + f.getType().getSimpleName());
            System.out.println("name : " + f.getName());
        });
    }
}
