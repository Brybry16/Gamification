package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.RuleDto;
import ch.heigvd.gamification.api.dto.ErrorDto;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T15:10:29.339+01:00")

@Api(value = "rules", description = "the rules API")
public interface RulesApi {

    @ApiOperation(value = "Post rules", notes = "post a rule", response = RuleDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "return rule", response = RuleDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = RuleDto.class) })
    @RequestMapping(value = "/rules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<RuleDto> rulesPost() {
        // do some magic!
        return new ResponseEntity<RuleDto>(HttpStatus.OK);
    }

}
