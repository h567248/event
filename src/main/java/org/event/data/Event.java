package org.event.data;

public class Event {
    final long msBegin;
    final long msEnd;
    final String [] attributeNames;
    final String [] attributeValues;

    public Event(long msBegin, long msEnd, String[] attributeNames, String[] attributeValues) {
        this.msBegin = msBegin;
        this.msEnd = msEnd;
        this.attributeNames = attributeNames;
        this.attributeValues = attributeValues;
    }
}
