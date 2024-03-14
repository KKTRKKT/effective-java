package me.kktrkkt.effectivejava._06_avoid_creating_unnecessary_objects;

import java.util.regex.Pattern;

// 정규식을 매번 생성하기 보다는 재사용하는것이 메모리와 성능에 좋다.
public class RomanNumerals {

    static final Pattern ROMAN_REGEX = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumberSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    static boolean isRomanNumberFast(String s) {
        return ROMAN_REGEX.matcher(s).matches();
    }

    public static void main(String[] args) {
        long startSlow = System.nanoTime();
        for (int i=0; i<100; i++){
            isRomanNumberSlow("MCMLXXVI");
        }
        long endSlow = System.nanoTime();

        System.out.printf("slow : %d\n", endSlow - startSlow);

        long startFast = System.nanoTime();
        for (int i=0; i<100; i++){
            isRomanNumberFast("MCMLXXVI");
        }
        long endFast = System.nanoTime();

        System.out.printf("fast : %d\n", endFast - startFast);
    }
}
