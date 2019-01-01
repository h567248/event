package org.event.data;

public class EventFactory {


    final String[] attributeNames;

    public EventFactory(String[] attributeNames) {
        this.attributeNames = attributeNames;
    }

    public Event newEvent(long msBegin, long msEnd, String[] attributeValues) {
        return new Event(msBegin,msEnd,attributeNames,attributeValues);
    }
}
