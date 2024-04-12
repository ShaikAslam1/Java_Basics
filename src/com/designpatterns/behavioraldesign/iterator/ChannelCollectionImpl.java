package com.designpatterns.behavioraldesign.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new ChannelIteratorImpl(type, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelType type;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelType type,
                                   List<Channel> channelsList) {
            this.type = type;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelType.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }
}
