package com.chenle.Consumer02.controller;


import com.chenle.Consumer02.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer02Controller {
    @Autowired
    ProviderFeign providerFeign;

    @GetMapping("test")
    String test() {
        return providerFeign.print();
    }
}
