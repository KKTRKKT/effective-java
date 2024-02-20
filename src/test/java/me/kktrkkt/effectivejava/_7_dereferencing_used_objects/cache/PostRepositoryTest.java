package me.kktrkkt.effectivejava._7_dereferencing_used_objects.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryTest {

    @Test
    void cacheTest() throws InterruptedException {

        PostRepository postRepository = new PostRepository();

        postRepository.findById(1);

        assertFalse(postRepository.cache.isEmpty());

        System.gc();
        Thread.sleep(3000L);

        assertTrue(postRepository.cache.isEmpty());
    }
}