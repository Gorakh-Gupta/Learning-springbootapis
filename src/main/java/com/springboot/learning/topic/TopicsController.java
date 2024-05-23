package com.springboot.learning.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return  Arrays.asList(
                new Topic("Spring","Spring","good framework to create a atandalione api"),
                new Topic("Python", "Python", "a good programming language")
        );
    }
}
