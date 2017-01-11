package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.ScalePointDto;
import ch.heigvd.gamification.dao.ScalePointRepository;
import ch.heigvd.gamification.models.ScalePoint;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
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
    ScalePointRepository scalePointRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public ResponseEntity<List<ScalePointDto>> scalepointsGet() {
        List<ScalePointDto> scalePointDtos = new ArrayList<>();

        for (ScalePoint scalePoint: scalePointRepository.findAll())
            scalePointDtos.add(convertToDto(scalePoint));

        return ResponseEntity.ok(scalePointDtos);
    }

    @Override
    public ResponseEntity<ScalePointDto> scalepointsPost(
            @ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name
    ) {
        ScalePoint scalePoint = new ScalePoint();
        scalePoint.setName(name);
        scalePointRepository.save(scalePoint);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> scalepointsSpIdDelete(
            @ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") Long spId
    ) {
        ScalePoint scalePoint = scalePointRepository.findOne(spId);

        if (scalePoint != null) {
            scalePointRepository.delete(scalePoint);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<ScalePointDto> scalepointsSpIdGet(
            @ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") Long spId
    ) {
        ScalePoint scalePoint = scalePointRepository.findOne(spId);

        if (scalePoint != null)
            return ResponseEntity.ok(convertToDto(scalePoint));

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<ScalePointDto> scalepointsSpIdPut(
            @ApiParam(value = "The scale point identifier number",required=true ) @PathVariable("spId") Long spId
            ,@ApiParam(value = "Name of the scale point", required = true) @RequestParam(value = "name", required = true) String name
    ) {
        ScalePoint scalePoint = scalePointRepository.findOne(spId);

        if (scalePoint == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        scalePoint.setName(name);

        scalePointRepository.save(scalePoint);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    ScalePoint convertToEntity(ScalePointDto scalePointDto) {
        return modelMapper.map(scalePointDto, ScalePoint.class);
    }
    ScalePointDto convertToDto(ScalePoint scalePoint) {
        return modelMapper.map(scalePoint, ScalePointDto.class);
    }
}
