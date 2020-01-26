package org.raccoon.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import org.springframework.kafka.annotation.KafkaListener;


public class Reader {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Reader.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @KafkaListener(topics = "mytopic")
    public void read(String payload) {
        LOGGER.info("received payload='{}'", payload);
        latch.countDown();
    }
}