package me.kktrkkt.effectivejava._28_use_lists_rather_than_arrays;

/*
    배열보다는 리스트를 사용해라
        - 배열은 공변이고 리스트는 불공변이다.
            -> 배열은 Object[] array = new String[10]; 성립 -> 문자열 배열에 정수형 요소를 넣어도 런타임 전까지는 알 수 없다
            -> 리스트는 List<Object> list = new ArrayList<String>()이 성립되지 않음  -> 컴파일 시점에 알 수 있다
        - 배열은 실체화되지만 제네릭은 실체화되지 않는다(소거) -> 제네릭은 java 5와의 호환성을 위해 컴파일 시점 제네릭 타입은 사라지고 제네릭 타입을 참고해 캐스팅한 코드가 추가되는 형식
        - 제네릭타입은 배열로 선언할 수 없다. -> 공변되는 배열의 문제가 발생하지 않음
        - 제네릭타입을 배열로 만드는 방법 가변인자로 받는다 T... 등 -> 비검사 경고가 뜨지만 안전한 코드일 경우엔 @SafeVarargs를 달아 무시할 수 있다. ->
 */