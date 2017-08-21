package com.study.javaweb.test1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyNo01Service {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public Long doService01() {
        try {
            logger.info("my log4j2 test");
        } catch (Exception e) {
            return -1L;
        }
        return 0L;
    }
}
