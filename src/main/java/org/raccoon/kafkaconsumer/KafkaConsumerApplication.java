package org.raccoon.kafkaconsumer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class KafkaConsumerApplication  {

    // implements CommandLineRunner

    private String message;
    private String key;

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }



}
