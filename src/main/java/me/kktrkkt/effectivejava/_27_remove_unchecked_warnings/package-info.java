package me.kktrkkt.effectivejava._27_remove_unchecked_warnings;

/*
    비검사 경고를 제거하라
        - 비검사 경고란 컴파일은 가능하지만 타입 안정성을 보장할 수 없을때 발생되는 경고
        - 가능한 모든 비검사 경고를 제거를 권고
        - 경고를 제거할 수 없지만 타입 안정성이 보장될 경우 @SuppressWarnings("unchecked")를 추가
        - @SuppressWarnings("unchecked")는 가능한 좁은 범위로 선언
        - @SuppressWarnings("unchecked") 선언시 선언한 이유(안전한 이유)도 주석으로 추가
 */