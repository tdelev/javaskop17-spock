package me.delev.javaskop17.interaction;

/**
 * Observer
 */
public interface Subscriber {
    void recieve(String message);

    boolean isActive();
}
