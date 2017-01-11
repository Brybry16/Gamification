package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.ActionDto;
import ch.heigvd.gamification.api.dto.RuleDto;
import ch.heigvd.gamification.dao.RuleRepository;
import ch.heigvd.gamification.models.Action;
import ch.heigvd.gamification.models.Rule;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class RulesApiController implements RulesApi {
    @Autowired
    private RuleRepository ruleRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public ResponseEntity<RuleDto> rulesPost(@ApiParam(value = "The infos from a rule.", required = true) @RequestBody RuleDto rule) {
        RuleDto ruleDto = new RuleDto();
        ActionDto action = new ActionDto();
        action.setType("My Action type");
        action.setPayload("This my payload");
        ruleDto.setAction(action);
        ruleDto.setEventType("My Event Type");
        ruleDto.setId((long)1);
        return ResponseEntity.ok(ruleDto);
    }

    @Override
    public ResponseEntity<Void> rulesRuleIdDelete(
            @ApiParam(value = "The rule identifier number",required=true ) @PathVariable("ruleId") Long ruleId
    ) {
        Rule rule = ruleRepository.findOne(ruleId);

        if (rule != null) {
            ruleRepository.delete(rule);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<RuleDto> rulesRuleIdGet(
            @ApiParam(value = "The rule identifier number",required=true ) @PathVariable("ruleId") Long ruleId


    ) {
        Rule rule = ruleRepository.findOne(ruleId);

        if (rule != null)
            return ResponseEntity.ok(convertToDto(rule));

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<RuleDto> rulesRuleIdPut(
            @ApiParam(value = "The rule identifier number",required=true ) @PathVariable("ruleId") Long ruleId
            ,@ApiParam(value = "Type of the event triggering the rule", required = true) @RequestParam(value = "eventType", required = true) String eventType
            ,@ApiParam(value = "Action to do when the event is triggered" ,required=true ) @RequestBody ActionDto action
    ) {
        Rule rule = ruleRepository.findOne(ruleId);

        if (rule == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        rule.setEventType(eventType);
        rule.setAction(convertToEntity(action));

        ruleRepository.save(rule);

        return ResponseEntity.ok(convertToDto(rule));
    }

    Rule convertToEntity(RuleDto ruleDto) {
        return modelMapper.map(ruleDto, Rule.class);
    }
    RuleDto convertToDto(Rule rule) {
        return modelMapper.map(rule, RuleDto.class);
    }

    Action convertToEntity(ActionDto actionDto) {
        return modelMapper.map(actionDto, Action.class);
    }
}
