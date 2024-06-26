package me.kktrkkt.effectivejava._26_dont_use_raw_type;

/*
    제네릭에서 raw 타입은 사용하지 말것
        - 제네릭이란 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시점에 결정하는 기술
            - 제네릭 선언법 클래스<타입> -> public class Example<T>, <타입>메소드 -> public <T> example() -> 리턴 타입이 들어감
            - 제네릭 타입을 제한하기 위해서 extends를 사용함, 설계<Integer> -> 사용<Object>는 호환 안됨, 설계<Integer>와 사용<? extends Object>는 호환됨
        - raw 타입이란 제네릭을 사용하지 않고 타입을 선언하는 것
        - raw 타입을 사용하면 사용 편의성이 떨어지고 타입 안정성도 떨어짐
        - 사용 편의성은 타입 캐스팅을 통해 사용하기 때문에 떨어짐
        - 타입 안정성은 타입 캐스팅시 오류가 날 확률이 줄어듬
            -> 제네릭은 지정된 타입 이외에 다른 타입이 들어오는것을 아예 방지함
            -> 와일드 카드로 선언된 변수는 내부 데이터를 수정하지 못하므로 타입 안정성이 향상

 */