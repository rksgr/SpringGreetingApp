package com.example.springgreetingcontroller.service;

import com.example.springgreetingcontroller.entity.Greeting;
import com.example.springgreetingcontroller.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IGreetingService {

    Greeting addGreeting(User user);
}