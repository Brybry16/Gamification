package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.RegistrationDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T17:25:39.314+01:00")

@Api(value = "registrations", description = "the registrations API")
public interface RegistrationsApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "Registrations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Register a new application", response = Void.class) })
    @RequestMapping(value = "/registrations",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> registrationsPost(

@ApiParam(value = "The info required to register an application." ,required=true ) @RequestBody RegistrationDto registration

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
