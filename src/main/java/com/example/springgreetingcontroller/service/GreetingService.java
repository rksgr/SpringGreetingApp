package com.example.springgreetingcontroller.service;

import com.example.springgreetingcontroller.entity.Greeting;
import com.example.springgreetingcontroller.entity.User;
import com.example.springgreetingcontroller.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;


public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello, India" : user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
    }
}
