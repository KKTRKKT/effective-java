package me.kktrkkt.effectivejava.etc.final_and_JMM;

/*
    JMM은 Java Memory Model의 약자다 JLS 17.4와 17.5에 명세되어 있다
    JMM은 프로그램 실행 규칙이다.
    멀티 스레드 환경에서 final로 선언하지 않았다면 인수가 초기화되지 않았어도 객체를 가져다 사용할 수 있다.
    final로 선언하면 다른 스레드는 final이 초기화 될때까지 기다린다(freeze)
 */