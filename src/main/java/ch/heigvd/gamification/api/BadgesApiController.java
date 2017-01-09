package ch.heigvd.gamification.api;

import ch.heigvd.gamification.dao.*;
import ch.heigvd.gamification.repositories.BadgeRepository;
import ch.heigvd.gamification.repositories.RegistrationRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class BadgesApiController implements BadgesApi {

    BadgeRepository badgeRepository;
    RegistrationRepository registrationRepository;

    @Autowired
    public BadgesApiController(BadgeRepository badgeRepository, RegistrationRepository registrationRepository) {
        this.badgeRepository = badgeRepository;
        this.registrationRepository = registrationRepository;
    }


    public ResponseEntity<Void> badgesBadgeIdDelete(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") String badgeId


    ) {
        Badge badge = badgeRepository.findOne(Long.getLong(badgeId));

        if (badge != null) {
            badgeRepository.delete(badge);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<InlineResponse200> badgesBadgeIdGet(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") String badgeId


    ) {
        Badge badge = badgeRepository.findOne(Long.getLong(badgeId));

        if (badge != null)
            return new ResponseEntity(badge, HttpStatus.OK);

        return new ResponseEntity<InlineResponse200>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Void> badgesBadgeIdPut(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") String badgeId


            , @ApiParam(value = "Name of the badge") @RequestParam(value = "name", required = false) String name


            , @ApiParam(value = "Path to the image") @RequestParam(value = "image", required = false) String image


    ) {
        Badge badge = badgeRepository.findOne(Long.getLong(badgeId));

        if (badge == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        badge.setName(name);
        badge.setImage(image);

        badgeRepository.save(badge);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Badge>> badgesGet() {
        Iterable<Badge> badges = badgeRepository.findAll();

        return new ResponseEntity(StreamSupport.stream(badges.spliterator(), true) , HttpStatus.OK);
    }

    public ResponseEntity<Badge> badgesPost(

            @ApiParam(value = "The info required to add a badge.", required = true) @RequestBody Badge badge

    ) {
        badgeRepository.save(badge);
        return new ResponseEntity<Badge>(HttpStatus.OK);
    }
}
