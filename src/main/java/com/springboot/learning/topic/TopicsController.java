package com.springboot.learning.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return  topicService.getAllTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic( @PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopics(@RequestBody Topic topic){
        topicService.addTopics(topic);
    }
}
