package me.kktrkkt.effectivejava.etc.reference;

// 일반적으로 객체를 참조하면 null이 될때 gc에 대상이 된다.
public class StringReferenceExample {

    public static void main(String[] args) {
        Object obj = new Object();
        obj = null;
    }
}
