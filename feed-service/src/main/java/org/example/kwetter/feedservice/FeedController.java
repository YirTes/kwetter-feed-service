package org.example.kwetter.feedservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/feed")
public class FeedController {
    @GetMapping
    public List<String> feed() {
        return List.of("Feed service is running");
    }
}
