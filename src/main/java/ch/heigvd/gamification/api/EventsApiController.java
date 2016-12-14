package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.Event;
import ch.heigvd.gamification.dao.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class EventsApiController implements EventsApi {
    @Autowired
    private EventsRepository eventsRepository;

    public ResponseEntity<Event> eventsPost() {
        // do some magic!
        return new ResponseEntity<Event>(HttpStatus.OK);
    }
}
