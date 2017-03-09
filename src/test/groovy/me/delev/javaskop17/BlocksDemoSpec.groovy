package me.delev.javaskop17

import spock.lang.Specification
import spock.lang.Unroll

import static spock.util.matcher.HamcrestMatchers.closeTo

/**
 * Basic Spock blocks demonstration
 */
class BlocksDemoSpec extends Specification {

    /**
     * Basic given-when-then feature
     */
    def "reverse list"() {
        given:
        def list = [1, 2, 3]

        when:
        Collections.reverse(list)

        then:
        list == [3, 2, 1]
    }

    /**
     * Data-driven feature
     */
    @Unroll
    def "sorted list '#list' should be '#result'"() {
        when:
        Collections.sort(list)

        then:
        list == result

        where:
        list      | result
        [3, 5, 1] | [1, 3, 5]
        [3, 3, 3] | [3, 3, 3]
        [5]       | [5]
        []        | []
    }

    /**
     * Using `expect` block for pure functions
     */
    @Unroll
    "#num rounded is #rounded"() {
        expect:
        rounded == Math.round(num)

        where:
        num    | rounded
        1.0    | 1l
        1.4999 | 1l
        1.5    | 2l
        1.99   | 2l
    }
}
