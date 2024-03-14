package me.kktrkkt.effectivejava._4_private_constructor;

// private 메소드로 생성을 막고 리플렉션까지 막기 위해서 에러를 던진다.
public class Util {

    private Util(){
        throw new AssertionError();
    }
}
