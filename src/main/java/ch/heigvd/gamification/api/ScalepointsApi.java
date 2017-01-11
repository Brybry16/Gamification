package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.ErrorDto;
import ch.heigvd.gamification.api.dto.ScalePointDto;
import ch.heigvd.gamification.api.dto.InlineResponse2001Dto;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T15:10:29.339+01:00")

@Api(value = "scalepoints", description = "the scalepoints API")
public interface ScalepointsApi {

    @ApiOperation(value = "Get all the scale points", notes = "The scale point endpoint returns informations about all the *Scale Points*.  ", response = ScalePointDto.class, responseContainer = "List", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all the Scale Points", response = ScalePointDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ScalePointDto.class) })
    @RequestMapping(value = "/scalepoints",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<ScalePointDto>> scalepointsGet() {
        // do some magic!
        return new ResponseEntity<List<ScalePointDto>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Add a Scale point", notes = "The scale points endpoint to add a new scale point. ", response = ScalePointDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Scale points has been successfully created", response = ScalePointDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ScalePointDto.class) })
    @RequestMapping(value = "/scalepoints",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ScalePointDto> scalepointsPost(@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name



) {
        // do some magic!
        return new ResponseEntity<ScalePointDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a Scale point", notes = "The Scale point endpoint to delete a Scale point. ", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The scale point has been deleted", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/scalepoints/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> scalepointsSpIdDelete(
@ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") String spId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a scale point", notes = "Get basic information about a scale point.", response = InlineResponse2001Dto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The scale point object", response = InlineResponse2001Dto.class) })
    @RequestMapping(value = "/scalepoints/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse2001Dto> scalepointsSpIdGet(
@ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") String spId


) {
        // do some magic!
        return new ResponseEntity<InlineResponse2001Dto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update a Badge", notes = "The scale point endpoint to update a scale point. ", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The scale point has been updated", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/scalepoints/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> scalepointsSpIdPut(
@ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") String spId


,@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
