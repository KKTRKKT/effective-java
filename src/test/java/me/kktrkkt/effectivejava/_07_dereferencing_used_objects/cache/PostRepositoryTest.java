package me.kktrkkt.effectivejava._07_dereferencing_used_objects.cache;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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

    @Test
    void backgroundThread() throws InterruptedException {
        ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1);
        PostRepository postRepository = new PostRepository();
        postRepository.findById(1);

        Runnable removeOldCache  = () -> {
            System.out.println("running removing task");
            Optional<CacheKey> key = postRepository.cache.keySet().stream().min(Comparator.comparing(CacheKey::getCreated));
            key.ifPresent(k->{
                System.out.println("removing key : " + k);
                postRepository.cache.remove(k);
            });
        };

        executor.scheduleAtFixedRate(removeOldCache, 1, 3, TimeUnit.SECONDS);

        Thread.sleep(10000L);

        assertTrue(postRepository.cache.isEmpty());
    }
}