package me.kktrkkt.effectivejava._08_avoid_finalizer_and_cleaner.autocloser;

import org.junit.jupiter.api.Test;

class AutoCloserExampleTest {

    @Test
    void name() throws Exception {
        try(final AutoCloserExample autoCloserExample = new AutoCloserExample()) {

        }
    }
}