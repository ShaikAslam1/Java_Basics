package com.designpatterns.behavioraldesign.iterator;

public class Channel {
    private double frequency;
    private ChannelType TYPE;

    public Channel(double frequency, ChannelType TYPE) {
        this.frequency = frequency;
        this.TYPE = TYPE;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelType getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", TYPE=" + TYPE +
                '}';
    }
}
