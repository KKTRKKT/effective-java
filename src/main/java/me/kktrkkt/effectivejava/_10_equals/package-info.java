package me.kktrkkt.effectivejava._10_equals;

/*
equals는 일반 규약을 지켜 재정의하라.
    1. equals를 정의할 필요가 없는 경우
        - 인스턴스가 하나밖에 없을 경우
        - 인스턴스의 동등성 비교가 필요없고 동일성 비교만 필요한 경우 
        - 상위 클래스에서 정의한 equals가 하위 클래스에도 적절한 경우 (LIST, SET)
        - 클래스가 private이거나 package 접근자이고 equals를 호출할 일이 없는 경우

* 동등성 두 개체가 같은 값을 가지고 있으면 동등하다
* 동일성 두 개체가 완전히 같으면 동일하다.
 */