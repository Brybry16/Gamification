package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.dao.ScalepointRepository;
import io.swagger.model.ScalePoint;
import javafx.scene.transform.Scale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Controller
public class ScalepointsApiController implements ScalepointsApi {

    @Autowired
    private ScalepointRepository scalepointRepository;

    public ResponseEntity<List<ScalePoint>> scalepointsGet() {
        ArrayList<ScalePoint> badges = (ArrayList<ScalePoint>) scalepointRepository.findAll();
        return new ResponseEntity<List<ScalePoint>>(HttpStatus.OK);
    }

    public ResponseEntity<ScalePoint> scalepointsPost(@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name


    ) {
        ScalePoint scalePoint = new ScalePoint();
        scalePoint.setName(name);
        scalepointRepository.save(scalePoint);

        return new ResponseEntity<ScalePoint>(HttpStatus.OK);
    }

}
