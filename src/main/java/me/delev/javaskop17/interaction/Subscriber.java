package me.delev.javaskop17.interaction;

/**
 * Observer
 */
public interface Subscriber {
    void receive(String message);

    boolean isActive();
}
