package io.angelinux.CourseApi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private final List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("spring", "Spring Framework", "Spring framework basics"),
                    new Topic("java", "Core java", "Core Java topics"),
                    new Topic("javascript", "Javascript essentials", "Javascript essentials topics")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic updatedTopic) {
        for(int i = 0; i < topics.size(); i++) {
           Topic t = topics.get(i);
           if(t.getId().equals(id)) {
             topics.set(i, updatedTopic);
             return;
           }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
