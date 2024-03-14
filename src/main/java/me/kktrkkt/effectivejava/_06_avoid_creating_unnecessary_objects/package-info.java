package me.kktrkkt.effectivejava._06_avoid_creating_unnecessary_objects;

/*
불필요한 객체 생성을 피해라
    1. 문자열
        - 리터럴로 선언하면 자동으로 재사용하게 된다. new String으로 만들어서 사용하지 말것
    2. 정규식, Pattern
        - Pattern의 compile 작업은 비싼 작업이기 때문에 반복되는 경우에는 캐싱해서 재사용한다.
    3. 오토박싱, 언박싱
        - 참조형을 기본형으로 바꾸거나 그 반대에 경우 발생하며,  그 과정에서 불필요한 객체 생성이 발생할 수 있으므로 주의한다.

 */