package com.reddot.javatracing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "hello world\n";
    }

     @GetMapping("/")
    public String index() {
        return "Java-Tracing\n";
    }

}
