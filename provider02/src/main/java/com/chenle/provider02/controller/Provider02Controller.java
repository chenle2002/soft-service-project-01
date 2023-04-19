package com.chenle.provider02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider02Controller {
    @RequestMapping("method")
    String method(){
        return "service-provider-02";
    }
}
