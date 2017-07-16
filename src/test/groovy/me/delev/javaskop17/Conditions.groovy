package me.delev.javaskop17

import spock.lang.Specification

import static spock.util.matcher.HamcrestMatchers.closeTo
import static spock.util.matcher.HamcrestSupport.that

class Conditions extends Specification {

    def "when-then style"() {
        when:
        def x = Math.max(5, 9)

        then:
        x == 9
    }

    def "expect style"() {
        expect:
        Math.max(5, 9) == 9
    }

    def "more complex conditions"() {
        expect:
        getGermanCarBrands().any() { it.size() >= 4 }
    }

    def "Hamcrest matchers"() {
        expect:
        that computeAnswerToTheUniverse(), closeTo(42, 0.01)
    }

    def "compare sets"() {
        def set1 = ["Fred", "Wilma", "Dino"] as Set
        //def set2 = ["Fred", "Wilma", "Dino"] as Set
        def set2 = ["Wilma", "Dino", "Barney"] as Set

        expect:
        set1 == set2
    }

    def "compare POJOs"() {
        def person1 = new Person("Fred", 30, "Winstor Rd.")
        //def person2 = new Person("Fred", 30, "Winstor Rd.")
        def person2 = new Person("Frog", 30, "Windsor Rd.")

        expect:
        person1 == person2
    }

    def "with method"() {
        def person = new Person("Fred", 30, "Winstor Rd.")

        expect:
        with(person) {
            name == "Fred"
            age == 30
            address == "Winstor Rd."
        }
    }


    private getGermanCarBrands() { ["audi", "bmw", "porsche"] }

    private computeAnswerToTheUniverse() { 42.00387455 }

    private static class Person {
        String name
        int age
        String address

        Person(String name, int age, String address) {
            this.name = name
            this.age = age
            this.address = address
        }

        boolean equals(Object other) {
            other instanceof Person && other.name == name &&
                    other.age == age && other.address == address
        }
    }
}
