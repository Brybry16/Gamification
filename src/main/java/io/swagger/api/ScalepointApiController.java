package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.dao.ScalepointRepository;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ScalePoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Controller
public class ScalepointApiController implements ScalepointApi {

    @Autowired
    private ScalepointRepository scalepointRepository;

    public ResponseEntity<Void> scalepointSpIdDelete(
            @ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") BigDecimal spId


    ) {
        ScalePoint scalePoint = scalepointRepository.findOne(spId);
        scalepointRepository.delete(scalePoint);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> scalepointSpIdGet(
            @ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") BigDecimal spId


    ) {
        ScalePoint scalePoint = scalepointRepository.findOne(spId);
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<Void> scalepointSpIdPut(
            @ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") BigDecimal spId


            ,
            @ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name


    ) {
        ScalePoint scalePoint = new ScalePoint();
        scalePoint.setId(spId);
        scalePoint.setName(name);
        scalepointRepository.save(scalePoint);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
