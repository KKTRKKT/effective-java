package me.kktrkkt.effectivejava.etc.regular_expression;

import java.util.regex.Pattern;

// String에서 문자열을 사용하는 함수는 matches, replaceFirst, replaceAll, split 등이 있다
// 1문자 정규식일 경우 함수를 사용하는것이 빠르고, 2문자 이상일 경우에는 Pattern을 캐싱해 사용하는것이 빠르다.
public class StringExample {

    private static final Pattern SPLIT_PATTERN_1 = Pattern.compile(",");
    private static final Pattern SPLIT_PATTERN_2 = Pattern.compile(";;");

    public static void main(String[] args) {
        String effectiveJava = "effective,java";
        long start = System.nanoTime();
        for (int i=0; i<10000; i++){
            effectiveJava.split(",");
        }
        System.out.println("string split by one char : " + (System.nanoTime() - start));

        start = System.nanoTime();
        for (int i=0; i<10000; i++){
            SPLIT_PATTERN_1.split(effectiveJava);
        }
        System.out.println("template split by one char : " + (System.nanoTime() - start));

        String effectiveJava2 = "effective;;java";
        start = System.nanoTime();
        for (int i=0; i<10000; i++){
            effectiveJava2.split(";;");
        }
        System.out.println("string split by two char : " + (System.nanoTime() - start));

        start = System.nanoTime();
        for (int i=0; i<10000; i++){
            SPLIT_PATTERN_2.split(effectiveJava2);
        }
        System.out.println("template split by two char : " + (System.nanoTime() - start));

    }
}
