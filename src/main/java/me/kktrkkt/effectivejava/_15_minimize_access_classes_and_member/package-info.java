package me.kktrkkt.effectivejava._15_minimize_access_classes_and_member;

/*
    클래스와 멤버의 접근권한을 최소화하라.
    - 정보은닉을 하기위해서는 구현과 API를 분리하게 된다.
    - 장점
        - API 존재로 인해 구현부와 클라이언트가 동시에 개발 가능 -> 개발 속도 향상
        - API를 통해 컴포넌트 파악이 쉽다 -> 관리 비용 낮춤
        - 모듈화가 되므로 성능의 문제가 있는 모듈만 개선 가능 -> 성능 최적화 쉬워짐
        - API는 구현과 분리되어 있으므 다른 모듈에서 사용하기 쉽다 -> 소프트웨어 재사용성을 높임
        - 각 모듈을 독립적으로 개발하므로 시스템 설계가 쉽다 -> 개발 난이도를 낮춤
    - 클래스와 인터페이스의 접근제한자 원칙
        - 톱 레벨의 클래스와 인터페이스에는 package-private과 public 접근제한자를 사용할 수 있다.
        - public으로 설정할 시 API가 되므로 하위 호환성을 유지하려면 영원히 관리해야한다
        - package-private으로 선언하면 외부에서 사용할 수 없다
        - 한 클래스에서만 사용하는 package-private 클래스나 인터페이스는 해당 클래스의 private static 클래스로 선언한다.
    - 멤버(변수, 메서드, 중첩 클래스/인터페이스)의 접근제한자 원칙
        - private과 package-private은 내부 구현
        - public과 protected는 공개 API
        - 테스트를 위해 private -> private-package는 가능, 공개 API로 만드는건 X
        - 공개 API의 인스턴스 필드는 되도록 public이 아니어야된다.
        - public static final 배열 필드를 제공하거나 반환을 하지 말것
 */