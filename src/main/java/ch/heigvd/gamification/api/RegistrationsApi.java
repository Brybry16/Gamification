package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.Registration;

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

@Api(value = "registrations", description = "the registrations API")
public interface RegistrationsApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "Registrations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Register a new application", response = Void.class) })
    @RequestMapping(value = "/registrations",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> registrationsPost(

@ApiParam(value = "The info required to register an application." ,required=true ) @RequestBody Registration registration

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}