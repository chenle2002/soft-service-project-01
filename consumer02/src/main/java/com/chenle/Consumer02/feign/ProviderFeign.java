package com.chenle.Consumer02.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("service-provider-02")
public interface ProviderFeign {

    @RequestMapping("/method")
    String print();
}
