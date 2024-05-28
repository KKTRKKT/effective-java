package me.kktrkkt.effectivejava.etc.thread_local_random;

/*
    ThreadLocalRandom란 각 스레드에서 고유한 난수 생성기를 제공하는 클래스이다.
    ThreadLocalRandom을 쓰는 이유
        - java.util.Random에서 난수를 발생시킬 수 있지만 멀티스레드 환경에서 동기화가 필요하므로 성능 저하가 생길 수 있다.
        - ThreadLocalRandom은 각 스레드에서 고유한 난수 발생기를 제공하므로 동기화가 필요 없다
        - ThreadLocalRandom은 난수 발생기를 공유하지 않기 때문에 다른 스레드에 영향을 주지 않는다.

 */