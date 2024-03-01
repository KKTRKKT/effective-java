package me.kktrkkt.effectivejava.etc.stackoverflow_error;

/*
StackOverFlowError
    - 스택 메모리를 넘어설 경우 발생하는 에러
    - 스택은 쓰레드가 사용하는 메모리로 메소드 호출과 변수등의 정보를 저장한다
    - 주로 무한루프나 무한호출등의 상황에서 발생한다.
    -  -Xss2M 옵션 등으로 스택 사이즈를 늘릴 수 있다.

 */