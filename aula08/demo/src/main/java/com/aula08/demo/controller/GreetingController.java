package com.aula08.demo.controller;

import com.aula08.demo.model.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "67 farma aura professor, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/APIteste")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Eu odeio Java") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}