package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Registration;
import io.swagger.model.RegistrationSummary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Api(value = "registrations", description = "the registrations API")
public interface RegistrationsApi {

    @ApiOperation(value = "Get registered apps", notes = "Returns a list of all the registered applications. ", response = RegistrationSummary.class, responseContainer = "List", tags = {"Registrations",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all the registered applications", response = RegistrationSummary.class)})
    @RequestMapping(value = "/registrations",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<RegistrationSummary>> registrationsGet();


    @ApiOperation(value = "", notes = "", response = Void.class, tags = {"Registrations",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Register a new application", response = Void.class)})
    @RequestMapping(value = "/registrations",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> registrationsPost(

            @ApiParam(value = "The info required to register an application.", required = true) @RequestBody Registration registration

    );

}
