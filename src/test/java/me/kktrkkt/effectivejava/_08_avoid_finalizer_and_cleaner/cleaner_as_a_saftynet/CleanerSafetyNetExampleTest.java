package me.kktrkkt.effectivejava._08_avoid_finalizer_and_cleaner.cleaner_as_a_saftynet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CleanerSafetyNetExampleTest {

    @Test
    void autoCloseTest() throws Exception {
        try(final CleanerSafetyNetExample cleanerSafetyNetExample = new CleanerSafetyNetExample(new ArrayList<>())){
        }
    }

    @Test
    void safetyNetTest() throws InterruptedException {
        CleanerSafetyNetExample cleanerExample = new CleanerSafetyNetExample(new ArrayList<Object>());
        cleanerExample = null;

        System.gc();
        Thread.sleep(3000L);
    }
}