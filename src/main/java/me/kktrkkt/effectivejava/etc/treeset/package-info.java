package me.kktrkkt.effectivejava.etc.treeset;

/*
    TreeSet
    - 정렬된 set이다
    - 정렬 기준은 자연적인 순서(natural order)에 따라 정렬한다
    - 자연적인 순서는 Comparable을 구현해 설정이 가능하다.
    - 자연적인 순서가 없으면 treeSet에 넣을 수 없다
    - Comparator을 제공해주면 자연적인 순서가 없어도 넣을 수 있다.
    - 스레드 안전하게 넣으려면 Collections.synchronizedSet(set)을 통해 생성한다.
    - 내부적으로 이진 검색 트리(OlogN)를 사용

 */