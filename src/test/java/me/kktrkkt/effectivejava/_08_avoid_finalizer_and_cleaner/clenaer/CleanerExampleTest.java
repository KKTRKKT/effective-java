package me.kktrkkt.effectivejava._8_avoid_finalizer_and_cleaner.clenaer;

import org.junit.jupiter.api.Test;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

// cleaner는 실행이 보장되지 않아 불확실하다.
import static org.junit.jupiter.api.Assertions.*;

class CleanerExampleTest {

    @Test
    void cleanTestSuccess() throws InterruptedException {
        List<Object> list = new ArrayList<>();
        CleanerExample.ListCleaner action = new CleanerExample.ListCleaner(list);

        Cleaner cleaner = Cleaner.create();
        CleanerExample cleanerExample = new CleanerExample(list);
        cleaner.register(cleanerExample, action);

        cleanerExample = null;

        assertFalse(action.isClean());
        System.gc();
        Thread.sleep(3000L);
        assertTrue(action.isClean());
    }

    @Test
    void cleanTestFail() throws InterruptedException {
        List<Object> list = new ArrayList<>();
        CleanerExample.ListCleaner action = new CleanerExample.ListCleaner(list);

        if(true){
            Cleaner cleaner = Cleaner.create();
            CleanerExample cleanerExample = new CleanerExample(list);
            cleaner.register(cleanerExample, action);
        }

        assertFalse(action.isClean());
        System.gc();
        Thread.sleep(3000L);
        assertFalse(action.isClean());
    }
}