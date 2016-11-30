package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.ScalePoint;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Api(value = "scalepoints", description = "the scalepoints API")
public interface ScalepointsApi {

    @ApiOperation(value = "Get all the scale points", notes = "The scale point endpoint returns informations about all the *Scale Points*.  ", response = ScalePoint.class, responseContainer = "List", tags = {"Scale Points",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all the Scale Points", response = ScalePoint.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = ScalePoint.class)})
    @RequestMapping(value = "/scalepoints",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<ScalePoint>> scalepointsGet();


    @ApiOperation(value = "Add a Scale point", notes = "The scale points endpoint to add a new scale point. ", response = ScalePoint.class, tags = {"Scale Points",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Scale points has been successfully created", response = ScalePoint.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = ScalePoint.class)})
    @RequestMapping(value = "/scalepoints",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<ScalePoint> scalepointsPost(@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name


    );

}
