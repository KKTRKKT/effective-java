package me.kktrkkt.effectivejava.etc.gc;

/*
가비지 컬렉션

* 주요하게 볼것들
    1. GC 개념
    2. java GC 옵션
    3. java GC 로그 모니터링 툴

GC는 사용하지 않는 메모리를 정리해 메모리 공간을 확보해준다
    - gc 과정
        1. mark : 사용하지 않는 객체를 체크한다
        2. sweep : mark한 객체들을 정리한다.
        3. compact : 메모리 배열을 일자로 최적화시킨다.
    - gc 전략
        1. 객체 생성시 Young Generation 메모리 공간에 할당
        2. Young Generation 메모리 공간이 꽉차면 Minor GC를 한뒤, 그 다음 메모리 공간으로 이동 (Eden -> S0 -> S1 순)
        3. Young Generation의 모든 메모리 공간이 꽉차면 Old Generation 메모리 공간으로 이동
        4. Old Generation의 메모리 공간이 꽉차면 Full GC를 실행
    - Minor GC는 정지시간이 짧아 거의 눈에 띄지 않음
    - Full GC는 Minor GC보다 상대적으로 정지시간이 길어 오랜 시간이 소요될 수 있음

GC 알고리즘
    - Serial : 단일 스레드 사용
    - Parallel : serial 과 똑같지만 여러 스레드 사용
    - CMS : deprecated 됨
    - G1 : 대용량 메모리를 갖춘 다중 프로세서 시스템에 적합
    - ZGC : 대용량 메모리가 애플리케이션에 적합, Latency가 매우 짧음
    - Shenandoah : 힙크기 상관없이 응답시간이 매우 짧은 경우 적합, Latency가 매우 짧음

GC 로그 주요 지표
    - Throughput : 처리량
    - Latency (Stop-The-World) : stw 걸리는 시간
    - Footprint : GC가 사용하는 메모리 크기

gc 설정 참고 url https://developers.redhat.com/articles/2021/11/02/how-choose-best-java-garbage-collector#
 */