package me.kktrkkt.effectivejava._8_avoid_finalizer_and_cleaner.autocloser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoCloserExampleTest {

    @Test
    void name() throws Exception {
        try(final AutoCloserExample autoCloserExample = new AutoCloserExample()) {

        }
    }
}