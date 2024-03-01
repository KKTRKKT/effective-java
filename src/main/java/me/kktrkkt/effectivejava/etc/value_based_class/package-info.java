package me.kktrkkt.effectivejava.etc.value_based_class;

/*
Value 기반 클래스
    - 클래스지만 primitiveType처럼 사용하는 클래스다
    - 특징
        1. 식별자가 없고 불변
        2. 인스턴스의 값을 통해 equals, hashCode, toString을 구현
        3. equals를 사용해 비교
        4. 동일한 객체는 상호 교환이 가능하다.
    - 참고 java 17 record

 */