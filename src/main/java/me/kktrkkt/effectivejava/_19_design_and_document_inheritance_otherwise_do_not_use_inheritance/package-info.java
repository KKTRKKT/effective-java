package me.kktrkkt.effectivejava._19_design_and_document_inheritance_otherwise_do_not_use_inheritance;

/*
    상속을 고려해 설계하고 문서화해라, 그렇지 않으면 상속을 금지해라
    - 상속시 내부 구현을 문서화 할것, @implSpec 사용
    - 서브 클래스를 최소한 3개이상 구현해볼 것, 그중 한개는 타인으로부터 테스트
    - 상속용 클래스는 재정의가 가능한 메소드를 호출하면 안된다.
        - me.kktrkkt.effectivejava._13_clone.do_not_use_constructor Item 참고
    - 상속하지 않을거면 final 이든 private 생성자든 막아둘것
 */