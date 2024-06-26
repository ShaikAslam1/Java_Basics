package com.designpatterns.behavioraldesign.iterator;

public interface ChannelCollection {
    void addChannel(Channel channel);
    void removeChannel(Channel channel);
    ChannelIterator iterator(ChannelType type);
}
