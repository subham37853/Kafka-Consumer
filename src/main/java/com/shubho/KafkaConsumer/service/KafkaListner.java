package com.shubho.KafkaConsumer.service;

import com.shubho.KafkaConsumer.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {
    @KafkaListener(topics = "shubham", groupId = "group-id")
    public void consume(String message) {
        System.out.println(message);
    }
}
