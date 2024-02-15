package me.kktrkkt.effectivejava._6_avoid_creating_unnecessary_objects;

import java.util.stream.IntStream;

// 오토박싱과 언박싱이 자주 일어날 경우 성능에 안좋다.
// 오토박싱은 long -> Long 처럼 레퍼런스 타입을 자동으로 프리미티브 타입으로 변환해주는것을 뜻한다.
// 언박싱은 Long -> long처럼 프리미티브 타입을 레퍼런스 타입으로 변환해주는것을 뜻한다.
public class Sum {
    
    private static long sumSlow() {
        Long sum = 0L;
        for (int i=0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }
        return sum;
    }

    private static long sumFast() {
        long sum = 0L;
        for (int i=0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long startSlow = System.nanoTime();
        sumSlow();
        long endSlow = System.nanoTime();
        System.out.println((endSlow - startSlow) / 1_000_000. + " ms");

        long startFast = System.nanoTime();
        sumFast();
        long endFast = System.nanoTime();
        System.out.println((endFast - startFast) / 1_000_000. + " ms");
    }
    
}
