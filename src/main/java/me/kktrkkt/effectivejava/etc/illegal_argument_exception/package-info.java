package me.kktrkkt.effectivejava.etc.illegal_argument_exception;

/*
IllegalArgumentException은 잘못된 인자를 넘겨받았을때 던질 수 있는 기본 런타임 예외다

checked exception과 unchecked exception의 차이
checked exception은 컴파일 시점에서 확인이 가능하고, try문으로 반드시 처리를 해줘야한다.
unchecked exception는 런타임 시점에서 확인이 가능하고, try문으로 처리를 하지 않아도 된다.

간혹 메소드 선언부에 unchecked exception을 선언하는 이유
checked exception처럼 try문으로 처리를 강제하는 효과를 가진다.

checked exception은 왜 사용할까
예외처리를 강제해야하는 상황이 필요할때 사용한다.
 */