package io.angelinux.CourseApi.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring framework basics"),
                new Topic("java", "Core java", "Core Java topics"),
                new Topic("javascript", "Javascript essentials", "Javascript essentials topics")
        );
    }
}
