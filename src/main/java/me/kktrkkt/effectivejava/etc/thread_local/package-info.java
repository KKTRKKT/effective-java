package me.kktrkkt.effectivejava.etc.thread_local;

/*
    LocalThread란?
        - 한 쓰레드 내에서만 공유할 수 있는 저장소
    LocalThread 쓰는 이유
        - 기본적으로 모든 멤버 변수는 모든 쓰레드에서 공유하기 때문에 아래와 같은 문제 발생
            - 경합 또는 경쟁조건(Race-Condition)
                - 어떤 쓰레드가 먼저 변수에 접근하냐에 따라 결과가 달라짐
            - 교착상태(deadlock)
                - 서로의 자원을 기다리며 무한정 대기상태에 빠지는 것
            - LiveLock
                - 서로 자원을 양보하다가 무한정 대기상태에 빠지는 것(주로 데드락을 피하기 위해 자원을 해제하고 다시 시도하는 과정으로 불완전할 경우 나타남)
 */