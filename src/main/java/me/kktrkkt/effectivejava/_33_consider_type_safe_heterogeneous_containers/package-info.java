package me.kktrkkt.effectivejava._33_consider_type_safe_heterogeneous_containers;

/*
    타입 안전 이종 컨테이너를 고려하라
        타입 안전 이종 컨테이너는 서로 다른 타입의 데이터를 타입 안전하게 담을 수 있는 컨테이너이다
        구현 방법은 타입토큰을 이용하는 방법과 수 타입 토큰 한정정 타입 토큰을 이용하는 방법이 있다.
        1. 타입 토큰
            - 제네릭 타입을 런타임에 다루기 위한 방법(제네릭 타입은 컴파일 시점까지만 유효하다) -> Class<T>, Type 방법등이 있다.
        2. 수퍼 타입 토큰
            - 타입 토큰의 한계인 제네릭 타입에 제네릭 타입을 넣었을 때 구별하지 못하는 것을 극복하기 위한 방법으로
              익명 클래스와 getGenericSuperclass() 클래스를 통해 제네릭의 타입 정보를 런타임에 전달할 수 있다.
        3. 한정적 타입 토큰
            - 타입 토큰에 extends 키워드를 통해 한정시키는 방법
 */