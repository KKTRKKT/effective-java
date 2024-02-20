package me.kktrkkt.effectivejava.etc.reference;

import java.lang.ref.WeakReference;

// 객체가 GC에 의해 수거되면 약한 참조는 바로 사라진다.
public class WeakReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(o);
        o = null;

        System.out.println(weakReference.get());
        System.gc();
        Thread.sleep(2000L);
        System.out.println(weakReference.get());
    }
}
