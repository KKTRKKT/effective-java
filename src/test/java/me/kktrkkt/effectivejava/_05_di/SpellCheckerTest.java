package me.kktrkkt.effectivejava._5_di;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker englishSpellChecker = new SpellChecker(new EnglishDictionary());
        englishSpellChecker.isValid("test");
        SpellChecker koreanSpellChecker = new SpellChecker(new KoreanDictionary());
        koreanSpellChecker.isValid("test");
    }
}