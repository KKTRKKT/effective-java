package me.kktrkkt.effectivejava._32_be_careful_when_using_generics_and_variable_arguments_together;

/*
    제네릭과 가변인수를 함께 쓸때는 신중해라
        - 가변인수를 사용하면 배열이 되므로 공변 상태를 가진다.
        - 공변이 되면 힙오염이 발생해 제네릭의 장점인 타입 안정성이 사라진다.
        - 만약 안전하게 사용했다면 @SafeVarargs를 애노테이션을 붙여준다.
        - @SuppressWarning을 사용해도 되지만 @SafeVarargs를 사용하는 이유는 다른 warning이 발생했을때 구별하기 위해서이다

 */