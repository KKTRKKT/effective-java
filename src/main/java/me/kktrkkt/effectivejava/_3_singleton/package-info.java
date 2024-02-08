package me.kktrkkt.effectivejava._3_singleton;

/*
생성자나 열거타입으로 싱글톤임을 보장하라
    1. private 생성자 + public static final 필드
        장점: 간단하게 구현 가능하며, API에 싱글톤임을 나타낼 수 있다.
        단점:
            - 만약 외부 API 또는 비용이 드는 작업을 하는 싱글톤이면 클라이언트 테스트가 어려워진다
                -> Elvis를 사용하는 부분을 추상화해 비용이 적은 다른 작업으로 교체한다
            - 리플렉션으로 private 생성자 호출 가능
                -> private 생성자가 오직 한번만 작동하도록 한다.
            - 직렬화 역직렬화로 새 인스턴스 생성 가능
                -> private Object readResolve 메소드를 구현해 구현된 인스턴스를 반환한다.
    2. private 생성자 + private static final 필드
        장점:
            1. 메소드를 통해 인스턴스를 가져오기 때문에 클라이언트 코드에 영향을 덜준다.
            2. 메소드에는 제네릭을 사용할 수 있으므로 인스턴스의 타입을 런타임에 결정할 수 있다.
            3. Supplier로 사용할 수 있다.
        단점: 1번이랑 같음

* Supplier는 함수형 인터페이스로 생성 메소드 get 하나를 가지고 있고 사용하게 되면 di, lazyinit, funtional style, reusability 등의 장점이 있다.
 */