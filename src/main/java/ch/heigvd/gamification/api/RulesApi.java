package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.RuleDto;
import ch.heigvd.gamification.api.dto.ErrorDto;
import ch.heigvd.gamification.api.dto.ActionDto;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T19:02:38.829+01:00")

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
    default ResponseEntity<RuleDto> rulesPost(

@ApiParam(value = "The infos from a rule." ,required=true ) @RequestBody RuleDto rule

) {
        // do some magic!
        return new ResponseEntity<RuleDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a Rule", notes = "The endpoint to delete a Rule. ", response = Void.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Rule", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The rule has been deleted", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/rules/{ruleId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> rulesRuleIdDelete(
@ApiParam(value = "The rule identifier number",required=true ) @PathVariable("ruleId") Long ruleId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a rule", notes = "Get basic information about a rule.", response = RuleDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The rule object", response = RuleDto.class) })
    @RequestMapping(value = "/rules/{ruleId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<RuleDto> rulesRuleIdGet(
@ApiParam(value = "The rule identifier number",required=true ) @PathVariable("ruleId") Long ruleId


) {
        // do some magic!
        return new ResponseEntity<RuleDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update a scale point", notes = "The endpoint to update a rule. ", response = RuleDto.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The rule has been updated", response = RuleDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = RuleDto.class) })
    @RequestMapping(value = "/rules/{ruleId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<RuleDto> rulesRuleIdPut(
@ApiParam(value = "The rule identifier number",required=true ) @PathVariable("ruleId") Long ruleId


,@ApiParam(value = "Type of the event triggering the rule", required = true) @RequestParam(value = "eventType", required = true) String eventType



,

@ApiParam(value = "Action to do when the event is triggered" ,required=true ) @RequestBody ActionDto action

) {
        // do some magic!
        return new ResponseEntity<RuleDto>(HttpStatus.OK);
    }

}
