package com.jdriven.ng2boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

    @Value("${msg}")
    private String msg;

    @RequestMapping("/msg")
    public String msg(){
        return msg;
    }

}
