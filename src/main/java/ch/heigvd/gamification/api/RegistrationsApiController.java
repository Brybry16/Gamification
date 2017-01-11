package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.RegistrationDto;
import ch.heigvd.gamification.dao.RegistrationRepository;
import ch.heigvd.gamification.models.Registration;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class RegistrationsApiController implements RegistrationsApi {
    @Autowired
    RegistrationRepository registrationRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public ResponseEntity<Void> registrationsPost(
            @ApiParam(value = "The info required to register an application." ,required=true ) @RequestBody RegistrationDto registration
    ) {
        registrationRepository.save(convertToEntity(registration));

        return new ResponseEntity(HttpStatus.CREATED);
    }

    Registration convertToEntity(RegistrationDto registrationDto) {
        return modelMapper.map(registrationDto, Registration.class);
    }
    RegistrationDto convertToDto(Registration registration) {
        return modelMapper.map(registration, RegistrationDto.class);
    }
}
