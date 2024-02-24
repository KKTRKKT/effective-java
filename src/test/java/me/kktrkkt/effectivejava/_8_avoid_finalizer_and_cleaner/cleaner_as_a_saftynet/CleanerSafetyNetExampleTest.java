package me.kktrkkt.effectivejava._8_avoid_finalizer_and_cleaner.cleaner_as_a_saftynet;

import org.junit.jupiter.api.Test;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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