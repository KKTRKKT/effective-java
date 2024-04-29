package me.kktrkkt.effectivejava._20_use_interface_rather_than_abstract;

/*
    추상 클래스보다 인터페이스를 사용해라
        - 추상 클래스의 단점
            1. 상속은 하나밖에 되지 않는다
            2. 상속을 위한 클래스이므로 문서화 해야한다
        - 인터페이스의 장점
            1. 여러개를 상속할 수 있다
            2. wrapper 클래스와 함께 사용하면 기능 향상(_18_use_composition_rather_than_inheritance package-info.java 참고)
            3. 디폴트 메소드를 통해 간단한 메소드 추가 가능
        - 인터페이스의 단점
            1. 인스턴스 메소드를 추가할 수 없다.
        - 인터페이스 주의점
            - Object 메소드를 재정의하면 안된다.
                - Object는 인터페이스를 이긴다는 대전제가 깨짐
                - 클래스에서 Object와 인터페이스를 둘다 상속하고 구현할때 어떤 메소드를 쓸지 혼란이 온다
        - 추상 골격(skeletal) 클래스
            - 인터페이스와 추상 클래스의 장점을 합침
            - 인터페이스: 디폴트 메소드 추가
            - 추상클래스: 나머지 메소드 추가
            - 템플릿 메소드 패턴
            - 상속 문서화 필요(_19_design_and_document_inheritance_otherwise_do_not_use_inheritance package-info.java 참고)
        - 추상 골격 클래스 구현 방법
            1. 인터페이스 선언
            2. 추상클래스에서 인터페이스를 구현
            3. 서브클래스에서는 인터페이스만 구현
            4. 서브클래스에 내부 클래스를 추가하고 추상클래스를 상속
            5. 서브클래스에서 내부 클래스를 인스턴스로 생성
            6. 인터페이스의 구현을 내부 클래스로 위임

 */