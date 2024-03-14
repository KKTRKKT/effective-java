package me.kktrkkt.effectivejava._14_comparable;

/*
    Comparable을 구현할지 고민하라
        - 규약 : 반사성, 대칭성, 추이성, 일관성, 0이면 equals는 true(아닐 수 도있음)
        - 구현 방법
            - Comparable 인터페이스 구현
            - compareTo 메서드 재정의
            - 기본 타입은 박싱된 기본타입의 compare 함수로 비교
            - 객체는 compareTo로 비교
            - 중요한 필드 먼저 비교하고 0이면 그 다음을 비교한다
            - Comparable을 구현할 경우 상속대신 컴포지션을 통해 사용하게 할것
 */