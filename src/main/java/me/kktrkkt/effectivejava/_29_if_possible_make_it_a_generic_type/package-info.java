package me.kktrkkt.effectivejava._29_if_possible_make_it_a_generic_type;

/*
    이왕이면 제네릭 타입으로 만들어라
        - 배열을 사용하는 코드를 제네릭으로 만드는 두가지 방법
            - Object[] 대신 제네릭타입 배열을 사용
                - 형변환은 배열 생성 부분만 함
                - 가독성이 좋다
                - 힙 오염 가능성이 있다
            - Object 배열을 사용하고, 배열이 반환한 원소를 제네릭 타입으로 캐스팅하는 방법
                - 힙 오염 문제는 없지만 원소를 꺼낼때마다 캐스팅이 필요함
 */