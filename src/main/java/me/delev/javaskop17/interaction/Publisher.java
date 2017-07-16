package me.delev.javaskop17.interaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable
 */
public class Publisher {
    private List<Subscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void publish(String message) {
        subscribers.stream()
                //.filter(Subscriber::isActive)
                .forEach(subscriber -> subscriber.receive(message));
    }
}
