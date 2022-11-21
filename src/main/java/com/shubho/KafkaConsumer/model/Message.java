package com.shubho.KafkaConsumer.model;

public class Message {
    private int id;
    private String message;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
