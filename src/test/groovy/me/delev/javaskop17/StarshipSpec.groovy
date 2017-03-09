package me.delev.javaskop17

import spock.lang.Specification

/**
 * Example 1
 */
class StarshipSpec extends Specification {

    def "science officer of the starship Enterprise is Spock"() {
        given:
        def starship = new Starship("Enterprise", "Spock")

        when:
        def actual = starship.getScienceOfficer()

        then:
        actual == "Spock"
    }
}
