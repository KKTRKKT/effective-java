package me.kktrkkt.effectivejava._13_clone;

/*
clone 재정의 주의해서 진행해라.
    clone 핵심 규약
        - x.clone() != x -> true
        - x.clone().getClass() == x.getClass() -> true
        - x.clone().equals(X) -> true or false
    불변객체일시 구현
        - Cloneable 인터페이스를 구현하고 반드시 super.clone()을 사용해 clone을 재정의한다.
 */