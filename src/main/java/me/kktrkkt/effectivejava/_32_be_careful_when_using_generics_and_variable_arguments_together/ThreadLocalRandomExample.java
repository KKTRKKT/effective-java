package me.kktrkkt.effectivejava._32_be_careful_when_using_generics_and_variable_arguments_together;

import java.util.concurrent.ThreadLocalRandom;

/*
    ThreadLocalRandom 사용법
    - ThreadLocalRandom.current()로 현재 스레드의 ThreadLocalRandom 인스턴스를 얻을 수 있다.
    - ThreadLocalRandom.current().nextInt()로 난수를 발생시킬 수 있다.
*/
public class ThreadLocalRandomExample {


    public static void main(String[] args) {
        Runnable task = () -> {
            int random = ThreadLocalRandom.current().nextInt(1, 100);
            System.out.println(Thread.currentThread().getName() + " random number: " + random);
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
