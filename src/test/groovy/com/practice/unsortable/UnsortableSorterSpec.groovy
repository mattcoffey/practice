package com.practice.unsortable

import spock.lang.Specification

class UnsortableSorterSpec extends Specification {
    def "should sort array with mix of int and int array"() {
        expect:
            new UnsortableSorter().sort(nested) == expected

        where:
            nested                                   | expected
            new Object[]{4, 2, 3}                    | new Object[]{2, 3, 4}
            new Object[]{-1, 2, 3}                   | new Object[]{-1, 2, 3}
            new Object[]{2, wrapInt(3), wrapInt(-1)} | new Object[]{wrapInt(-1), 2, wrapInt(3)}
    }

    static def wrapInt(int i) {
        return new int[]{i};
    }

}
