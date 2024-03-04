package me.kktrkkt.effectivejava.etc.thread_safety;

/*
멀티 스레드 환경에서 공유하는 데이터가 있을때 안전하게 변경하는 방법
멀티스레드 환경에서는 동시에 데이터를 변경할 수 있기 때문에 처리가 제대로 안될 수 있다.
    - synchronization - 메소드 또는 블록에 lock을 걸어 하나의 스레드만 접근하게 하는 방식
    - ThreadLocal - 쓰레드 단위 로컬 변수 설정
    - 불변 객체 - 값이 변하지 못하게 막는다
    - Synchronized 데이터 - 쓰레드에 안전한 데이터를 쓰는 것 예)HashTable
    - Concurrent 데이터 - java.util.concurrent 패키지에서 지원하는 자료구조를 쓰는것 예)ConcurrentHashMap
    ...
 */