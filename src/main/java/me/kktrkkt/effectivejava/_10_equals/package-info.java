package me.kktrkkt.effectivejava._10_equals;

/*
equals는 일반 규약을 지켜 재정의하라.
    1. equals를 정의할 필요가 없는 경우
        - 인스턴스가 하나밖에 없을 경우
        - 인스턴스의 동등성 비교가 필요없고 동일성 비교만 필요한 경우 1
        - 상위 클래스에서 정의한 equals가 하위 클래스에도 적절한 경우 (LIST, SET)
        - 클래스가 private이거나 package 접근자이고 equals를 호출할 일이 없는 경우
    2. equals 일반 규약
        - 반사성 : equals는 자기 자신과 비교한 값은 언제나 참이다. A.equals(A) == true
        - 대칭성 : equals는 비교 대상과 위치를 바꾸어도 언제나 값이 같아야한다. A.equals(B) == B.equals(A)
        - 추이성 : equals는 A와 B가 같고 B와 C가 같으면 A와 C가 같다. A.equals(B) == B.equals(C) == A.equals(C)
        - 일관성 : equals는 여러번 호출해도 결과가 같아야한다. A.equals(B) == A.equals(B)
        - null-아님 : equals의 비교대상이 null이면 항상 false다. A.equals(null) == false
    3. equals 구현 방법
        - 자신의 참조인지 확인한다 (this == obj)
        - instanceOf로 올바른 타입인지 확인한다 (obj InstanceOf ExpectedType)
        - 핵심 필드만 비교하며 실수(Double, Float) 등은 compare로 비교, primitiveType들은 ==으로 비교, referenceType들은 equals로 비교
    4. equals 구현 도우미
        - google auto value
        - lombok @EqualsAndHashCode @ToString (권장)
        - IDE 자동 생성 (권장)
        - record

* 동등성 두 개체가 같은 값을 가지고 있으면 동등하다
* 동일성 두 개체가 완전히 같으면 동일하다.
 */