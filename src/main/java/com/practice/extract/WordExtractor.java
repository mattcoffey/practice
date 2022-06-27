package com.practice.extract;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordExtractor {

    public String removeWordFromSentence(String sentence, String word) {
        String[] parts = sentence.split(word);
        return Arrays.stream(parts)
                .map(String::trim)
                .collect(Collectors.joining(" "))
                .trim();
    }
}
