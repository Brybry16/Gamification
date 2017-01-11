package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.BadgeDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T17:25:39.314+01:00")

@Api(value = "badges", description = "the badges API")
public interface BadgesApi {

    @ApiOperation(value = "Delete a Badge", notes = "The Badge endpoint to delete a Badge. ", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The badge has been deleted", response = Void.class),
        @ApiResponse(code = 404, message = "Badge not found", response = Void.class) })
    @RequestMapping(value = "/badges/{badgeId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> badgesBadgeIdDelete(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") Long badgeId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a badge", notes = "Get basic informations about a badge.", response = BadgeDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The badge object", response = BadgeDto.class) })
    @RequestMapping(value = "/badges/{badgeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<BadgeDto> badgesBadgeIdGet(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") Long badgeId


) {
        // do some magic!
        return new ResponseEntity<BadgeDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update a Badge", notes = "The Badge endpoint to update a Badge.", response = BadgeDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The badge has been updated", response = BadgeDto.class),
        @ApiResponse(code = 404, message = "Badge not found", response = BadgeDto.class) })
    @RequestMapping(value = "/badges/{badgeId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<BadgeDto> badgesBadgeIdPut(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") Long badgeId


,@ApiParam(value = "Name of the badge") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "Path to the image") @RequestParam(value = "image", required = false) String image



) {
        // do some magic!
        return new ResponseEntity<BadgeDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get all the badges", notes = "The badge endpoint returns informations about all the *Badges*. ", response = BadgeDto.class, responseContainer = "List", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all the badges", response = BadgeDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = BadgeDto.class) })
    @RequestMapping(value = "/badges",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<BadgeDto>> badgesGet() {
        // do some magic!
        return new ResponseEntity<List<BadgeDto>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Add a Badge", notes = "The Badge endpoint to add a new Badge.", response = BadgeDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Badge has been successfully created", response = BadgeDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = BadgeDto.class) })
    @RequestMapping(value = "/badges",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<BadgeDto> badgesPost(

@ApiParam(value = "The info required to add a badge." ,required=true ) @RequestBody BadgeDto badge

) {
        // do some magic!
        return new ResponseEntity<BadgeDto>(HttpStatus.OK);
    }

}
