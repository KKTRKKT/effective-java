package me.kktrkkt.effectivejava.etc.unchecked_exception;

/*
    UncheckedException을 사용해야 하는 기준
    - 클라이언트가 복구할 수 있는 상황일 경우에는 CheckedException
    - 클라이언트가 복구할 수 없는 상황일 경우에는 UncheckedException

    예시
    - 동물 클래스가 있을 때, 사람이라는 값을 못 넣는 동물 이름을 설정하는 메소드를 클라이언트가 사람 값을 넣을때
        -> CheckedException을 던지고 Exception의 docs를 잘 정리해서 다른 값을 넣도록 안내해야한다.

 */