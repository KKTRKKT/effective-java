package me.kktrkkt.effectivejava._05_di;

public class EnglishDictionary implements Dictionary{

    @Override
    public boolean contains(String word) {
        return true;
    }

    @Override
    public String closeWordsTo(String typo) {
        return null;
    }
}
