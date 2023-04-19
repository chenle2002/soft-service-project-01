package com.chenle.consumer01.controller;

import com.chenle.consumer01.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer01Controller {
    @Autowired
    ProviderFeign providerFeign;

    @GetMapping("test")
    String test() {
        return providerFeign.print();
    }
}
