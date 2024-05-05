package me.kktrkkt.effectivejava.etc.concurrent_modification_exception;

/*
    콜렉션은 순회 도중에 데이터가 삭제되거나 변경되는 것을 방지한다. 멀티 스레드 환경에서 순회 도중 데이터가 변경되는것을 막기 위해서
        - 멀티스레드 환경 뿐만 아니라 싱글 스레드에서도 발생가능 -> fail-fast 이터레이터를 사용해 순회 도중 데이터를 변경하는 경우

    *fail-fast는 디자인 원칙중 하나로 오류가 감지되면 프로그램을 중단되도록 하는 것 -> 더큰 문제로 번지기 전에 대처 가능

 */