package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.InlineResponse2001;
import ch.heigvd.gamification.api.dto.ScalePoint;
import ch.heigvd.gamification.dao.ScalepointsRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class ScalepointsApiController implements ScalepointsApi {

    @Autowired
    private ScalepointsRepository scalepointsRepository;

    @Override
    public ResponseEntity<List<ScalePoint>> scalepointsGet() {
        ArrayList<ScalePoint> badges = (ArrayList<ScalePoint>) scalepointsRepository.findAll();
        return new ResponseEntity<List<ScalePoint>>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ScalePoint> scalepointsPost(@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name) {
        ScalePoint scalePoint = new ScalePoint();
        scalePoint.setName(name);
        scalepointsRepository.save(scalePoint);

        return new ResponseEntity<ScalePoint>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> scalepointsSpIdDelete(@ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") String spId) {
        ScalePoint scalePoint = scalepointsRepository.findOne(spId);
        scalepointsRepository.delete(scalePoint);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<InlineResponse2001> scalepointsSpIdGet(@ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") String spId) {
        ScalePoint scalePoint = scalepointsRepository.findOne(spId);
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> scalepointsSpIdPut(@ApiParam(value = "The scale point identifier number", required = true) @PathVariable("spId") String spId, @ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name) {
        ScalePoint scalePoint = new ScalePoint();
        scalePoint.setId(spId);
        scalePoint.setName(name);
        scalepointsRepository.save(scalePoint);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
