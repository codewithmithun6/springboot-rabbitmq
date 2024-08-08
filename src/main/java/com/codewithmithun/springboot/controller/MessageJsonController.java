package com.codewithmithun.springboot.controller;

import com.codewithmithun.springboot.dto.User;
import com.codewithmithun.springboot.publisher.RabbitMQJsonProducer;
import com.codewithmithun.springboot.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {

    private RabbitMQJsonProducer rabbitMQJsonProducer;

    public MessageJsonController(RabbitMQJsonProducer rabbitMQJsonProducer) {
        this.rabbitMQJsonProducer = rabbitMQJsonProducer;
    }
// http://localhost:8080/api/v1/publish?message=welcome to home

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        rabbitMQJsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Message sent to RabbitMQ...");


    }
}
