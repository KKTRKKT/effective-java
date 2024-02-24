package me.kktrkkt.effectivejava._8_avoid_finalizer_and_cleaner;

/*
finalizer와 cleaner 사용을 피해라
    - os는 파일을 열 수 있는 갯수가 제한되어 있기 때문에 자원 반납이 제대로 되지 않으면 에러가 발생할 수 있다.
    1. finalizer는 객체 소멸 시점에 자원을 반납하는 방법이다. 하지만 아래와 같은 문제점이 있다
        - 예외가 발생할 시 실행이 보장되지 않음
        - 심각한 성능 문제
    2. cleaner는 GC가 해당 객체를 수거 하는 시점에 쓰레드를 통해 자원을 반납하는 방법이다. 하지만 아래와 같은 문제점이 있다.
        - 스코프에 의해 객체가 제거되는 경우 실행이 보장되지 않음
        - 심각한 성능 문제
    3. autoCloseable은 try-with-resources 블록이 닫히는 시점에 자동으로 자원을 반납하는 방법이다.
        - 자원 반납시 가장 권장하는 방법으로 실행이 보장된다.
        - 단, 클라이언트측에서 try-with-resources를 사용하지 않을 경우를 대비해 cleaner를 통해 자원 반납 안전망을 만들 수 있다.
    4. 자원 반납 안전망이란 객체가 AutoCloseable을 구현하지만 클라이언트가 try-with-resources 문법을 사용하지 않을 경우를 대비한 방법으로 GC가 수거할때 자원을 같이 반납할 수 있도록 하는 방식이다.

 */