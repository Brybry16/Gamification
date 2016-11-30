package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.ScalePoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Controller
public class ScalepointsApiController implements ScalepointsApi {

    public ResponseEntity<List<ScalePoint>> scalepointsGet() {
        // do some magic!
        return new ResponseEntity<List<ScalePoint>>(HttpStatus.OK);
    }

    public ResponseEntity<ScalePoint> scalepointsPost(@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name


    ) {
        // do some magic!
        return new ResponseEntity<ScalePoint>(HttpStatus.OK);
    }

}
