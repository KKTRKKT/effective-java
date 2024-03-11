package me.kktrkkt.effectivejava._13_clone;

/*
clone 재정의 주의해서 진행해라.
    clone 핵심 규약
        - x.clone() != x -> true
        - x.clone().getClass() == x.getClass() -> true
        - x.clone().equals(X) -> true or false
    불변객체일시 구현
        - Cloneable 인터페이스를 구현하고 반드시 super.clone()을 사용해 clone을 재정의한다.
        - clone 재정의시 접근제어자는 public, 리턴 타입은 자신 클래스
    가변객체일시 구현
        - super.clone()과 clone 재정의까지는 같다
        - 배열 요소가 있을 경우 얕은복사만 필요할경우에는 clone()을 쓰고 깊은 복사가 필요하면 따로 구현이 필요하다
        - 오버라이딩 가능 메소드는 참조 x -> 하위 메소드에서 재정의하면 clone에 문제가 생김
        - abstract 메소드는 Cloneable 구현 x -> 상속 객체에게 부담을 준다 -> 기본 구현 또는 clone 막기
        - 동기화 안전해야한다면 동기화 처
    clone 대신 권장 방법
        - 복사 생성자 또는 복사 팩토리
        - clone을 쓰면 final 못씀
 */