package me.kktrkkt.effectivejava.etc.reference;

/*
레퍼런스는 종류는 총 4가지가 있다.
    - Strong : 객체를 바로 참조하는 경우로 일반적으로 주로 사용한다
    - Weak : 객체 참조가 사라지면 GC의 대상이 된다.
    - Soft : 객체 참조가 사라지고 메모리가 부족하면 GC의 대상이 된다.
    - Phantom : 객체 참조가 사라지면 큐에 들어가게 된다.

 */