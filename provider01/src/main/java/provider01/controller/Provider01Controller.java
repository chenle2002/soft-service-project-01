package provider01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider01Controller {
    @RequestMapping("method")
    String method(){
        return "service-provider-01";
    }
}
