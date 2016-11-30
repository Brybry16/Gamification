package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Registration;
import io.swagger.model.RegistrationSummary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Controller
public class RegistrationsApiController implements RegistrationsApi {

    public ResponseEntity<List<RegistrationSummary>> registrationsGet() {
        // do some magic!
        return new ResponseEntity<List<RegistrationSummary>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> registrationsPost(

            @ApiParam(value = "The info required to register an application.", required = true) @RequestBody Registration registration

    ) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
