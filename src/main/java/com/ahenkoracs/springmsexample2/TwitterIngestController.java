package com.ahenkoracs.springmsexample2;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterIngestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/ingestTwitterData")
    public FilteredStreamDemo greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new FilteredStreamDemo();
    }
}
