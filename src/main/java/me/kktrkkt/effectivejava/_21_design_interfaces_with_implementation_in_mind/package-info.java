package me.kktrkkt.effectivejava._21_design_interfaces_with_implementation_in_mind;

/*
구현하는 쪽을 생각해서 인터페이스를 설계해라
    - 인터페이스의 디폴트 메소드 추가시 구현하는 쪽을 고려해야 한다
        1. 구현 클래스가 동기적인지 비동기적인지
            - Collection의 removeIf는 인터페이스 상으로 아무 문제 없는 디폴트 메소드지만 SynchronizedCollection에서 사용하면 동기화 하는 부분이 없으므로 안전해지지 않는다
        2. 클래스는 인터페이스를 이긴다
            - extends 받은 클래스에서 private 메소드 이름과 interface의 디폴트 메소드가 같으면 클래스가 우선이므로 클래스의 private 메소드를 가리켜 오류가 발생한다

 */