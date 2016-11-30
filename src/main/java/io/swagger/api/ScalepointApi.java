package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.InlineResponse2001;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Api(value = "scalepoint", description = "the scalepoint API")
public interface ScalepointApi {

    @ApiOperation(value = "Delete a Scale point", notes = "The Scale point endpoint to delete a Scale point. ", response = Void.class, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The scale point has been deleted", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/scalepoint/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> scalepointSpIdDelete(
            @ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") BigDecimal spId


    );


    @ApiOperation(value = "Get a scale point", notes = "Get basic information about a scale point.", response = InlineResponse2001.class, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The scale point object", response = InlineResponse2001.class) })
    @RequestMapping(value = "/scalepoint/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> scalepointSpIdGet(
            @ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") BigDecimal spId


    );


    @ApiOperation(value = "Update a Badge", notes = "The scale point endpoint to update a scale point. ", response = Void.class, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The scale point has been updated", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/scalepoint/{sp-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> scalepointSpIdPut(
            @ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") BigDecimal spId


            , @ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name


    );

}
