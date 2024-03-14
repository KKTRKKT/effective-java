package me.kktrkkt.effectivejava._14_comparable;

import java.math.BigDecimal;

// Comparable 규약
// 반사성, 대칭성, 추이성, 일관성, 0이면 equals는 true(아닐수도 있음)
public class App {

    public static void main(String[] args) {
        BigDecimal n1 = new BigDecimal(1);
        BigDecimal n2 = new BigDecimal(2);
        BigDecimal n3 = new BigDecimal(3);
        BigDecimal n4 = new BigDecimal(4);

        System.out.println("--------------------반사성--------------------");
        // 0
        System.out.println(n1.compareTo(n1));

        System.out.println("--------------------대칭성--------------------");
        // 1, -1
        System.out.println(n1.compareTo(n2));
        System.out.println(n2.compareTo(n1));

        System.out.println("--------------------추이성--------------------");
        // 1, 1, 1
        System.out.println(n3.compareTo(n2));
        System.out.println(n2.compareTo(n1));
        System.out.println(n3.compareTo(n1));

        System.out.println("--------------------일관성--------------------");
        // -1, -1  -1
        System.out.println(n1.compareTo(n2));
        System.out.println(n2.compareTo(n4));
        System.out.println(n1.compareTo(n4));

        System.out.println("--------------------0이면 equals는 true(아닐수도 있음)--------------------");
        BigDecimal oneZero = new BigDecimal("1.0");
        BigDecimal oneZeroZero = new BigDecimal("1.00");
        // 0, false
        System.out.println(oneZero.compareTo(oneZeroZero));
        System.out.println(oneZero.equals(oneZeroZero));
    }
}
