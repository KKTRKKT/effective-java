package me.kktrkkt.effectivejava.etc.thread_safety;

import java.util.concurrent.ConcurrentHashMap;

// synchronized와 volatile 키워드를 통해 메소드 또는 블록에 락을 걸어 하나의 스레드만 접근 가능하게한다.
public class SynchronizationExample {

    private int a;

    private int b;

    private volatile Integer sum;

    public SynchronizationExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 메소드에 락을 거는 방법
    // 여러 스레드가 메소드를 한번에 호출하면 속도가 느려질 수 있다.
//    public synchronized int sum() {
//        if(sum != null){
//            return sum;
//        }
//        sum =  a + b;
//        return sum;
//    }

    // double checked locking 기법으로 lock 사용을 덜하도록 최소화 시킨다.
    public int sum() {
        if(this.sum != null) {
            return sum;
        }

        synchronized (this) {
            Integer result = this.sum;
            if(result == null){
                result =  a + b;
                sum = result;
            }
            return result;
        }
    }

}
