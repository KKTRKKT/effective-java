package me.kktrkkt.effectivejava.etc.countdownlatch;

/*
    병행(concurrency)과 병렬(parallelism)의 차이
    병행: 하나의 프로세서가 여러 작업을 번갈아 실행
    병렬: 여러 작업을 여러 프로세스가 실행

    병행과 병렬이 동시에 사용될 수 있다.

    java.util.concurrent는 병행 애플리케이션 유틸 패키지

    CountDown048520-\-3++0L  -*atch는 카운트 다운을 통해 쓰레드를 실행하거나 종료시점을 정할때 사용할 수 있는 유틸리티다
        ㅈㄴ`+- 사용법
        1. new CountDownLatch(숫자) 형식으로 생성이 가능하다
        2. await() 함수를 호출하면 그 쓰레드는 카운트다운이 0이 될때까지 대기한다.
        3. 다른 쓰레드에서 countDown() 메소드를 호출할때마다 숫자가 -1씩 줄어든다.
        * 재사용할 수 없고 숫자 리셋시 CyclicBarrier 참고

 */