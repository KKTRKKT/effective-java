package me.kktrkkt.effectivejava._08_avoid_finalizer_and_cleaner.finalizer;

import org.junit.jupiter.api.Test;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

class FinalizerExampleTest {

    // finalize 함수가 작동하지 않을 수 있다는 예시를 보여주기 위한 코드이지만, 자바 9부터 모듈 간의 접근성과 가시성이 엄격하게 관리되어 오류가 발생된다.
    @Test
    void finalizeTest() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        int i = 0;
        while(true){
            i++;
            new FinalizerExample();

            if(i % 1_000_000 == 0) {
                Class<?> finalizerClass = Class.forName("java.lang.ref.Finalizer");
                Field queue = finalizerClass.getDeclaredField("queue");
                queue.setAccessible(true);

                Field queueLength = ReferenceQueue.class.getDeclaredField("queueLength");
                queueLength.setAccessible(true);
                long length = queueLength.getLong(queue.get(null));

                System.out.println("reference queue length : " + length);
            }
        }
    }
}