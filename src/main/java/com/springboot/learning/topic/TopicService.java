package com.springboot.learning.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring","Spring","good framework to create a atandalione api"),
            new Topic("Python", "Python", "a good programming language")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }


    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopics( Topic topic) {
        topics.add(topic);
    }

    public void updateTopics(Topic topic, String id) {
        for(int i=0;i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return ;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
