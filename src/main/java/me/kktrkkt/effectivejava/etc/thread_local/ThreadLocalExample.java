package me.kktrkkt.effectivejava.etc.thread_local;

// 각 스레드마다 고유한 저장소를 가질 수 있다.
public class ThreadLocalExample {

    private static ThreadLocal<Integer> userId = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            int currentUserId = userId.get();
            System.out.println(Thread.currentThread().getName() + " initial userId: " + currentUserId);

            userId.set(currentUserId + 1);

            System.out.println(Thread.currentThread().getName() + " updated userId: " + userId.get());
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
