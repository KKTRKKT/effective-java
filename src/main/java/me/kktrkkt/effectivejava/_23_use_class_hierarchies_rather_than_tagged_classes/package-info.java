 package me.kktrkkt.effectivejava._23_use_class_hierarchies_rather_than_tagged_classes;

/*
    태그 달린 클래스보다는 클래스 계층 구조를 활용해라
        - 태그 달린 클래스란 태그라는 값을 통해 여러 역할을 수행하는 클래스를 의미한다.
        - 태그를 사용하면 특정 역할에만 사용하는 필드가 생기므로 사용하지 않는 필드만큼 메모리 낭비가 생긴다
        - 태그 대신 상속을 통해 역할을 나눌 것
 */