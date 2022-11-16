package com.sunglowsys.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class MessageConsumer {
    @KafkaListener(topics= "mytopic", groupId = "mygroup")
    public void consumerFromTopic(String message){
        System.out.println("consumed message:" +message);
    }
}
