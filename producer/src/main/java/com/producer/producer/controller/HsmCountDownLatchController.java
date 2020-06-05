package com.producer.producer.controller;

import com.producer.producer.listener.MyListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hsm")
public class HsmCountDownLatchController {

    @GetMapping(value = "")
    public Object getUserList() {
        MyListener.HSM_COUNTDOWN_LATCH.countDown();
        return "OK";
    }
}
