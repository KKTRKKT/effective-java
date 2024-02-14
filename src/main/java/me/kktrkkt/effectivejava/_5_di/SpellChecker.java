package me.kktrkkt.effectivejava._5_di;

// 의존 객체의 인터페이스를 주입받아서 사용한다.
// 의존 객체만 바꾸면 동작이 바뀐다.
public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public String suggest(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
