package com.pretty.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/dc")
public class controller {

    @Value("server.port")
    private String serverPort;

    @GetMapping(value = "/dc")
    public String dc() {
        return serverPort;
    }
}
