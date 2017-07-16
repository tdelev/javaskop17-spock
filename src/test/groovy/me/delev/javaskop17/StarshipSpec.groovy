package me.delev.javaskop17

import spock.lang.Specification
import spock.lang.Subject

/**
 * Starship Specification
 */
class StarshipSpec extends Specification {

    def "science officer of the starship Enterprise is Spock"() {
        given:
        @Subject
        def starship = new Starship("Enterprise", "Spk")

        when:
        def actual = starship.getScienceOfficer()

        then:
        actual == "Spock"
    }
}
