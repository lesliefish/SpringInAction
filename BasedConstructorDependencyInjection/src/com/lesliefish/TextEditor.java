package com.lesliefish;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("TextEditor 构造方法.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        this.spellChecker.checkSpelling();
    }
}
