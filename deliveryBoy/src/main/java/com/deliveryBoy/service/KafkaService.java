package com.deliveryBoy.service;

import com.deliveryBoy.config.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class KafkaService {

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public boolean updateLocation(String location){

        kafkaTemplate.send(Constants.LOCATION_TOPIC_NAME,location);
        this.logger.info("Location Produced");
        return true;
    }



}
