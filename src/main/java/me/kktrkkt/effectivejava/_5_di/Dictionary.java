package me.kktrkkt.effectivejava._5_di;

// 의존객체의 공통 기능을 추상화해 인터페이스로 만든다
public interface Dictionary {

    boolean contains(String word);

    String closeWordsTo(String typo);
}
