package com.chenle.consumer01.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("service-provider-01")
public interface ProviderFeign {

    @GetMapping("/method")
    public String print();
}
