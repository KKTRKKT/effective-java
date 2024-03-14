package me.kktrkkt.effectivejava._05_di;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker englishSpellChecker = new SpellChecker(new EnglishDictionary());
        englishSpellChecker.isValid("test");
        SpellChecker koreanSpellChecker = new SpellChecker(new KoreanDictionary());
        koreanSpellChecker.isValid("test");
    }
}