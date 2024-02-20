package me.kktrkkt.effectivejava.etc.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

// 객체가 GC에 의해 수거되면 레퍼런스 큐에 들어가게 된다.
public class PhantomReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        ReferenceQueue<? super Object> pq = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(o, pq);
        o = null;

        System.out.println(phantomReference.refersTo(o));
        System.out.println(pq.poll());
        System.gc();
        Thread.sleep(2000L);
        System.out.println(phantomReference.refersTo(o));
        System.out.println(pq.poll());
    }
}
