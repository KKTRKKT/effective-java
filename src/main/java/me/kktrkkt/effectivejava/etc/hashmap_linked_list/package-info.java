package me.kktrkkt.effectivejava.etc.hashmap_linked_list;

/*
    해시맵 내부의 연결 리스트
    - 해시 충돌이 일어나면 중복된 값들을 저장하기 위해 연결리스트를 사용한다.
    - 자바 8에서는 중복된 값들이 많으면 연결리스트 대신 이진트리(레드블랙 트리)를 사용하게 변경되었다.
    연결리스트 조회 시간
    - O(N)
    이진트리 조회 시간
    - O(logN)
 */