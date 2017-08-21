package com.study.javaweb.test1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/test")
public class MyTestController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/api1")
    public byte[] myApi1() {
        logger.info("requst myApi1");
        return "ok".getBytes();
    }

    @ResponseBody
    @RequestMapping(value = "/api2")
    public void myApi2() {
        logger.info("requst myApi2");
    }
}
