package com.cfs.Notification_servicee;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
@KafkaListener(topics = "order-topic",groupId = "notification-group")
    public void message(String message){
        System.out.println("Notification Consumer message: " + message);
    }
}
