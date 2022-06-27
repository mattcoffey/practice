package com.practice.extract

import spock.lang.Specification

class WordExtractorSpec extends Specification {
    def "should remove word from sentence"() {
        expect:
            new WordExtractor().removeWordFromSentence(sentence, word) == expected
        where:
            sentence                | word   | expected
            "this is a sentence"    | "this" | "is a sentence"
            "this is this sentence" | "this" | "is sentence"
    }
}
