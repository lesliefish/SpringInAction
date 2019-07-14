package com.lesliefish;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    @Autowired
    private SpellChecker spellChecker; // 省去setter方法

    public TextEditor() {
        System.out.println("Inside TextEditor constructor.");
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
