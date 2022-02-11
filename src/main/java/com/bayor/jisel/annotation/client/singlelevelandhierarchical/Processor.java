package com.bayor.jisel.annotation.client.singlelevelandhierarchical;

import org.jisel.annotations.SealFor;
import org.jisel.annotations.TopLevel;

public interface Processor {

    String CHARACTER = "Character";
    String DIGIT = "Digit";
    String LETTER = "Letter";
    String VOWEL = "Vowel";
    String CONSONANT = "Consonant";

    @TopLevel
    void processObject(Object object);

    @SealFor(CHARACTER)
    @SealFor(DIGIT)
    @SealFor(LETTER)
    void processCharacter(char character);

    @SealFor(DIGIT)
    void processDigit(int digit);

    @SealFor(LETTER)
    @SealFor(VOWEL)
    @SealFor(CONSONANT)
    void processLetter(char letter);

    @SealFor(VOWEL)
    void processVowel(char vowel);

    @SealFor(CONSONANT)
    void processConsonant(char consonant);
}