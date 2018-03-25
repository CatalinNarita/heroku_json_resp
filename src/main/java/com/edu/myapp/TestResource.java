package com.edu.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by catal on 3/25/2018
 */

@RestController
@RequestMapping("/hello")
public class TestResource {


    @RequestMapping("/world")
    public GreetingDTO sayHello() {

        Greeting greeting = new Greeting("hello", "Hello world!");
        GreetingDTOMapper mapper = GreetingDTOMapper.INSTANCE;

        return mapper.mapToDTO(greeting);
    }

}
