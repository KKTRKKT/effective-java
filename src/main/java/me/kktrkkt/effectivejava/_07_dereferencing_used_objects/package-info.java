package me.kktrkkt.effectivejava._07_dereferencing_used_objects;

/*
다 쓴 객체 참조를 해제하라
    - 객체를 참조하는 부분이 남아있다면 GC의 대상이 되지 않아 메모리 누수의 원인이 될 수 있다.
    - 주로 자기 메모리를 관리하는 클래스에서 발생한다.
        1. 스택
        2. 캐시
        3. 리스너 또는 콜백
    - 객체 참조를 해제하는 방법 3가지
        1. 참조 객체를 Null 처리
        2. weak reference를 키로 쓰는 자료구조(Map, List, Set 등)를 사용
        3. 백그라운드 쓰레드를 통해 정리
 */
