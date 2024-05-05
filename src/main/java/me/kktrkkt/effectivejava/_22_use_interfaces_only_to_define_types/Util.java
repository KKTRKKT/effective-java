package me.kktrkkt.effectivejava._22_use_interfaces_only_to_define_types;

// 상수가 공유하는 곳이 많다면 유틸 클래스로 정의한다
public final class Util {

    private Util() {

    }

    public static final String CONSTANTS = "전역 상수";
}
