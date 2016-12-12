package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.Badge;
import ch.heigvd.gamification.api.dto.InlineResponse200;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-07T15:18:35.727+01:00")

@Api(value = "badges", description = "the badges API")
public interface BadgesApi {

    @ApiOperation(value = "Delete a Badge", notes = "The Badge endpoint to delete a Badge. ", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The badge has been deleted", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/badges/{badge-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> badgesBadgeIdDelete(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") String badgeId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a badge", notes = "Get basic informations about a badge.", response = InlineResponse200.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The badge object", response = InlineResponse200.class) })
    @RequestMapping(value = "/badges/{badge-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> badgesBadgeIdGet(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") String badgeId


) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update a Badge", notes = "The Badge endpoint to update a Badge.", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The badge has been updated", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/badges/{badge-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> badgesBadgeIdPut(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") String badgeId


,@ApiParam(value = "Name of the badge") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "Path to the image") @RequestParam(value = "image", required = false) String image



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get all the badges", notes = "The badge endpoint returns informations about all the *Badges*.  ", response = Badge.class, responseContainer = "List", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all the badges", response = Badge.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Badge.class) })
    @RequestMapping(value = "/badges",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<Badge>> badgesGet() {
        // do some magic!
        return new ResponseEntity<List<Badge>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Add a Badge", notes = "The Badge endpoint to add a new Badge.", response = Badge.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Badges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Badge has been successfully created", response = Badge.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Badge.class) })
    @RequestMapping(value = "/badges",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Badge> badgesPost(

@ApiParam(value = "The info required to add a badge." ,required=true ) @RequestBody Badge badge

) {
        // do some magic!
        return new ResponseEntity<Badge>(HttpStatus.OK);
    }

}
