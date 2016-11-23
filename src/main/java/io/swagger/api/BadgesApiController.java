package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Badge;
import io.swagger.model.InlineResponse200;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Controller
public class BadgesApiController implements BadgesApi {

    public ResponseEntity<Void> badgesBadgeIdDelete(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") BigDecimal badgeId


) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> badgesBadgeIdGet(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") BigDecimal badgeId


) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<Void> badgesBadgeIdPut(
@ApiParam(value = "The badge identifier number",required=true ) @PathVariable("badgeId") BigDecimal badgeId


,
        @ApiParam(value = "Name of the badge") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "Path to the image") @RequestParam(value = "image", required = false) String image



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Badge>> badgesGet(
@ApiParam(value = "The application id" ,required=true ) @RequestHeader(value="appId", required=true) String appId


) {
        // do some magic!
        return new ResponseEntity<List<Badge>>(HttpStatus.OK);
    }

    public ResponseEntity<Badge> badgesPost(

@ApiParam(value = "The info required to add a badge." ,required=true ) @RequestBody Badge badge

) {
        // do some magic!
        return new ResponseEntity<Badge>(HttpStatus.OK);
    }

}
