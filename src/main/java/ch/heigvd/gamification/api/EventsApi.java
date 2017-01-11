package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.EventDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T17:18:11.530+01:00")

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "Post events", notes = "add an event", response = EventDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Events", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "event has been successfully created", response = EventDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EventDto.class) })
    @RequestMapping(value = "/events",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<EventDto> eventsPost(

@ApiParam(value = "The infos from an event." ,required=true ) @RequestBody EventDto event

) {
        // do some magic!
        return new ResponseEntity<EventDto>(HttpStatus.OK);
    }

}
