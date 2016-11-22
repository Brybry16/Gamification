package main.rest;

import main.models.Badge;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BadgeController {

    @RequestMapping("/badges")
    public List<Badge> getBadges() {
        return Arrays.asList(
                new Badge(0, "Badge0", "img/badge0.png"),
                new Badge(1, "Badge1", "img/badge1.png"),
                new Badge(2, "Badge2", "img/badge2.png")
        );
    }
}
