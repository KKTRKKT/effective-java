package me.kktrkkt.effectivejava._31_increase_api_flexibility_using_qualified_wildcards;

/*
    한정적 와일드카드를 사용해 API 유연성을 높여라
        - 일반 제네릭만 사용하면 불공변 특성 때문에 하위타입이지만 사용하지 못할 수 있다.
        - 한정적 와일드카드를 사용하면 상위 타입 또는 하위타입을 받아서 사용할 수 있다.
        - ? extends T: 상위 타입을 받아야하는 경우
        - ? super T: 하위 타입을 받아야하는 경우

 */