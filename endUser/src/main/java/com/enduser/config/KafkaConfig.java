package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = Constants.LOCATION_TOPIC_NAME,groupId = Constants.LOCATION_TOPIC_GROUP_ID)
    public void updatedLocation(String value){
        System.out.println(value);
    }



}
