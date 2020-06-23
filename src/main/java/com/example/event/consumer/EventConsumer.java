package com.example.event.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventConsumer {
	private final Logger logger = LoggerFactory.getLogger(EventConsumer.class);
	@KafkaListener(topics = "${app.consumer.topic.subscribed-to}", groupId = "group.id")
	public void consume(String eventMessage) throws Exception {
		    logger.info(String.format("Consumed Message: %s", eventMessage));
    }

}
