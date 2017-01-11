package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.ActionDto;
import ch.heigvd.gamification.api.dto.RuleDto;
import ch.heigvd.gamification.dao.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class RulesApiController implements RulesApi {

    @Autowired
    private RuleRepository repository;

    @Override
    public ResponseEntity<RuleDto> rulesPost() {
        RuleDto rule = new RuleDto();
        ActionDto action = new ActionDto();
        action.setType("My Action type");
        action.setPayload("This my payload");
        rule.setAction(action);
        rule.setEventType("My Event Type");
        rule.setId("abc");
        return ResponseEntity.ok(rule);
    }
}
