package com.saurav.Practice_tools;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public void hello()
    {
        System.out.println("Hello Every one...");
    }


}
