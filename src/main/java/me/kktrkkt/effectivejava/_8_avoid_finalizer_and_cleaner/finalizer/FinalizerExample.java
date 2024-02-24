package me.kktrkkt.effectivejava._8_avoid_finalizer_and_cleaner.finalizer;

// Object의 finalize를 오버라이딩해 구현한다.
public class FinalizerExample {

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }

}
