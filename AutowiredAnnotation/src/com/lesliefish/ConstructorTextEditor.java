package com.lesliefish;

import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorTextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public ConstructorTextEditor(SpellChecker spellChecker) {
        System.out.println("Inside ConstructorTextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
