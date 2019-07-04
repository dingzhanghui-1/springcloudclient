package com.pretty.springcloudclient;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value = "/dc")
public class controller {




    @GetMapping(value = "/dc")
    public String dc()
    {
        return "";
    }
}
