package me.kktrkkt.effectivejava._8_avoid_finalizer_and_cleaner.finalizer;

public class FinalizerExample extends Object {

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }

}
