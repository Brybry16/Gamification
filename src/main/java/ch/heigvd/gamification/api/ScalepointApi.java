package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.Error;
import ch.heigvd.gamification.api.dto.InlineResponse2001;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Api(value = "scalepoint", description = "the scalepoint API")
public interface ScalepointApi {

    @ApiOperation(value = "Delete a Scale point", notes = "The Scale point endpoint to delete a Scale point. ", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The scale point has been deleted", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/scalepoint/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> scalepointSpIdDelete(
@ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") String spId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a scale point", notes = "Get basic information about a scale point.", response = InlineResponse2001.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The scale point object", response = InlineResponse2001.class) })
    @RequestMapping(value = "/scalepoint/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse2001> scalepointSpIdGet(
@ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") String spId


) {
        // do some magic!
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update a Badge", notes = "The scale point endpoint to update a scale point. ", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The scale point has been updated", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/scalepoint/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> scalepointSpIdPut(
@ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") String spId


,@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
