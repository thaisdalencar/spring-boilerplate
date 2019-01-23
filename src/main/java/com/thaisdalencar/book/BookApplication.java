package com.thaisdalencar.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

    private static final Logger logger = LoggerFactory.getLogger("Book.class");

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
        logger.info("Just check log config");
    }

}

