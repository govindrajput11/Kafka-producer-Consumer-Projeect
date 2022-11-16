package com.sunglowsys.rest;

import com.sunglowsys.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    MessageProducer messageProducer;

    @PostMapping(value = "/post")
    public void sendMessage(@RequestParam("msg") String msg){
        messageProducer.publishToTopic(msg);
    }
}