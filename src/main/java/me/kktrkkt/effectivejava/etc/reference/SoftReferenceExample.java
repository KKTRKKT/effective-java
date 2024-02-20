package me.kktrkkt.effectivejava.etc.reference;

import java.lang.ref.SoftReference;

// 객체가 GC에 의해 수거되어도 메모리가 부족하지 않으면 수거되지 않는다
public class SoftReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o);
        o = null;

        System.out.println(softReference.get());
        System.gc();
        Thread.sleep(2000L);
        System.out.println(softReference.get());
    }
}
