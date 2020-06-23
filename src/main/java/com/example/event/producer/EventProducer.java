package com.example.event.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service	
public class EventProducer {

	@Autowired
	private KafkaTemplate<Object, Object> kafkaTemplate;
	
	private final Logger logger = LoggerFactory.getLogger(EventProducer.class);
	
	public void sendEventMessage(String topic, String eventMessage) {
    		logger.info(String.format("Producing message: %s", eventMessage));
    		kafkaTemplate.send(topic,eventMessage);
    }
}
