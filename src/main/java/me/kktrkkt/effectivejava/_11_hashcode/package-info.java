package me.kktrkkt.effectivejava._11_hashcode;

/*
equals를 재정의하거든 hashcode도 재정의해라

hashcode의 규약
    - equals에 사용되는 값이 변경되지 않으면 hashcode도 똑같아야한다.
    - 두 객체가 equals가 같으면 hashcode도 같아야한다.
    - 두 객체의 equals가 달라도 같은값을 허용하지만 해시테이블 성능을 고려해 가능한 다른 값을 반환한다.

규약을 지켜야하는 이유
    - 해시코드를 구현하지 않으면 equals가 같아도 해시테이블에서 다른 값처럼 취급된다.
    - 해시코드를 똑같은 값만 나오도록 구현하면 해시 충돌이 일어나 o(1)의 성능이 o(n)+a 만큼 떨어진다.

구현 방법
    - 전통적인 hashcode 구현 방법
        1. result를 핵심 필드 하나의 hashCode값으로 초기화한다.
        2. 나머지 핵심필드마다 result에 31을 곱하고 hashcode값을 더해서 반환한다.
        * hashcode 구하는 방법은 기본 타입은 Type.hashCode
        * 참조 타입은 hashCode
        * 배열은 Arrays.hashCode
    - Objects.hash
        - 전통적인 hashcode 구현 방법으로 구현된 유틸 함수를 사용하는 방법
    - 캐싱
        - 핵심 필드가 모두 불변일때 hashcode를 캐싱해서 반환하는 방법

* 해시 충돌 : 해시 버킷이 있을때 해시코드가 같은면 같은 버킷을 쓰는 현상으로 해결법은 여러개가 있지만 HashMap같은 경우에는
 버킷에 링크드 리스트 만들어 이어주는 방식을 쓰기 때문에 성능이 o(n)+a 만큼 늘어난다.
 */