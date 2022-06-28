package com.practice.happyNumbers

import spock.lang.Specification

class HappyNumbersSpec extends Specification {

    def "should check if iterations on the sum of squares of digits reaches 1"() {
        expect:
            new HappyNumbers().isHappy(n) == expected
        where:
            n   | expected
            1   | true
            203 | true
            11  | false
            107 | false
    }

    def "should throw when argument is not positive integer"() {
        when:
            new HappyNumbers().isHappy(0)
        then:
            thrown(IllegalArgumentException)
    }

    def "should calculate single iterations of happy number correctly"() {
        expect:
            new HappyNumbers().sumSquaresOfDigits(n) == expected
        where:
            n   | expected
            1   | 1
            11  | 2
            107 | 50
            50  | 25
            25  | 29
            85  | 89
            89  | 145
            145 | 42
            20  | 4
            16  | 37
            58  | 89

    }
}
