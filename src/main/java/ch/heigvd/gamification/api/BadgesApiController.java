package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.BadgeDto;
import ch.heigvd.gamification.dao.BadgeRepository;
import ch.heigvd.gamification.models.Badge;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class BadgesApiController implements BadgesApi {
    @Autowired
    BadgeRepository badgeRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public ResponseEntity badgesPost(
            @ApiParam(value = "The info required to add a badge.", required = true)
            @RequestBody BadgeDto badgeDto) {
        Badge badge = convertToEntity(badgeDto);
        badgeRepository.save(badge);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<BadgeDto>> badgesGet() {
        List<BadgeDto> badgeDtos = new ArrayList<>();
        for (Badge badge: badgeRepository.findAll()) {
            badgeDtos.add(convertToDto(badge));
        }
        return ResponseEntity.ok(badgeDtos);
    }

    @Override
    public ResponseEntity<Void> badgesBadgeIdDelete(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") Long badgeId) {
        Badge badge = badgeRepository.findOne(badgeId);
        if(badge != null) {
            badgeRepository.delete(badgeId);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<BadgeDto> badgesBadgeIdPut(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") Long badgeId,
            @ApiParam(value = "Name of the badge") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Path to the image") @RequestParam(value = "image", required = false) String image) {
        Badge badge = badgeRepository.findOne(badgeId);
        if(badge != null) {
            if(name != null) badge.setName(name);
            if(image != null) badge.setImage(image);
            badgeRepository.save(badge);
            return null;
        }
        return null;
    }

    @Override
    public ResponseEntity<BadgeDto> badgesBadgeIdGet(@ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") Long badgeId) {
        Badge badge = badgeRepository.findOne(badgeId);
        if (badge != null) {
            return ResponseEntity.ok(convertToDto(badge));
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    Badge convertToEntity(BadgeDto badgeDto) {
        return modelMapper.map(badgeDto, Badge.class);
    }

    BadgeDto convertToDto(Badge badge) {
        return modelMapper.map(badge, BadgeDto.class);
    }

}
