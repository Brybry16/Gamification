package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.ScalePoint;
import ch.heigvd.gamification.api.dto.Error;

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

@Api(value = "scalepoints", description = "the scalepoints API")
public interface ScalepointsApi {

    @ApiOperation(value = "Get all the scale points", notes = "The scale point endpoint returns informations about all the *Scale Points*.  ", response = ScalePoint.class, responseContainer = "List", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all the Scale Points", response = ScalePoint.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ScalePoint.class) })
    @RequestMapping(value = "/scalepoints",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<ScalePoint>> scalepointsGet() {
        // do some magic!
        return new ResponseEntity<List<ScalePoint>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Add a Scale point", notes = "The scale points endpoint to add a new scale point. ", response = ScalePoint.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Scale Points", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Scale points has been successfully created", response = ScalePoint.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ScalePoint.class) })
    @RequestMapping(value = "/scalepoints",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ScalePoint> scalepointsPost(@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name



) {
        // do some magic!
        return new ResponseEntity<ScalePoint>(HttpStatus.OK);
    }

}
