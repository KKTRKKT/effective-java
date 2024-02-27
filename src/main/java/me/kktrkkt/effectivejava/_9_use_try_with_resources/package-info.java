package me.kktrkkt.effectivejava._9_use_try_with_resources;

/*
    try finally 대신 try-with-resources를 사용해라
        - try finally는 java 7 이후로 더 이상 최적의 방법이 아니다.
        - try-with-resources를 사용하면 코드가 더 짧고 간결해지며, 예외 정보도 더 잘 보여준다.
        
* try-with-resources처럼 exception을 suppress 하기 위해서는 Throwable의 addSuppressed(throwable)을 사용한다.
 */