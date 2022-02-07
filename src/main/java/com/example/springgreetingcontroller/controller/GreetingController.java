package com.example.springgreetingcontroller.controller;

import com.example.springgreetingcontroller.entity.Greeting;
import com.example.springgreetingcontroller.entity.User;


import com.example.springgreetingcontroller.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private IGreetingService iGreetingService;

    @GetMapping(value = {"", "/"})
    public Greeting greeting(@RequestParam(value = "fname", defaultValue = "world") String fname,
                             @RequestParam(value = "lname", defaultValue = "world") String lname) {
        User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return iGreetingService.addGreeting(user);
    }
}
