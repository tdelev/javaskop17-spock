package me.delev.javaskop17

import me.delev.javaskop17.interaction.Publisher
import me.delev.javaskop17.interaction.Subscriber
import spock.lang.Specification

/**
 * Interaction demo
 */
class PublisherSubscriberSpec extends Specification {

    def publisher = new Publisher()

    def subscriber1 = Mock(Subscriber)
    def subscriber2 = Mock(Subscriber)

    def setup() {
        publisher.subscribe(subscriber1)
        publisher.subscribe(subscriber2)
    }

    def "should deliver message to all active subscribers"() {
        given:
        subscriber1.isActive() >> true
        subscriber2.isActive() >> false

        when:
        publisher.publish("msg")

        then:
        1 * subscriber1.receive("msg")
        0 * subscriber2.receive(_)
    }

}
