package com.jmx.mxbeans;

public interface QueueSamplerMXBean {

    public QueueSample getQueueSample();
    public void clearQueue();
}
