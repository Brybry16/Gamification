package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Badge;
import io.swagger.model.InlineResponse200;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Api(value = "badges", description = "the badges API")
public interface BadgesApi {

    @ApiOperation(value = "Delete a Badge", notes = "Changed heu The Badge endpoint to delete a Badge. ", response = Void.class, tags = {"Badges",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "The badge has been deleted", response = Void.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Void.class)})
    @RequestMapping(value = "/badges/{badge-id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Void> badgesBadgeIdDelete(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") BigDecimal badgeId


    );


    @ApiOperation(value = "Get a badge", notes = "Get basic informations about a badge.", response = InlineResponse200.class, tags = {"Badges",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The badge object", response = InlineResponse200.class)})
    @RequestMapping(value = "/badges/{badge-id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> badgesBadgeIdGet(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") BigDecimal badgeId


    );


    @ApiOperation(value = "Update a Badge", notes = "The Badge endpoint to update a Badge. ", response = Void.class, tags = {"Badges",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "The badge has been updated", response = Void.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Void.class)})
    @RequestMapping(value = "/badges/{badge-id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Void> badgesBadgeIdPut(
            @ApiParam(value = "The badge identifier number", required = true) @PathVariable("badgeId") BigDecimal badgeId


            , @ApiParam(value = "Name of the badge") @RequestParam(value = "name", required = false) String name


            , @ApiParam(value = "Path to the image") @RequestParam(value = "image", required = false) String image


    );


    @ApiOperation(value = "Get all the badges", notes = "The badge endpoint returns informations about all the *Badges*.  ", response = Badge.class, responseContainer = "List", tags = {"Badges",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all the badges", response = Badge.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Badge.class)})
    @RequestMapping(value = "/badges",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<Badge>> badgesGet(
            @ApiParam(value = "The application id", required = true) @RequestHeader(value = "appId", required = true) String appId


    );


    @ApiOperation(value = "Add a Badge", notes = "The Badge endpoint to add a new Badge. ", response = Badge.class, tags = {"Badges",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Badge has been successfully created", response = Badge.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Badge.class)})
    @RequestMapping(value = "/badges",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Badge> badgesPost(

            @ApiParam(value = "The info required to add a badge.", required = true) @RequestBody Badge badge

    );

}
