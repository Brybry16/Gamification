package io.swagger.api;

import io.swagger.dao.EventsRepository;
import io.swagger.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

@Controller
public class EventsApiController implements EventsApi {

    @Autowired
    private EventsRepository eventsRepository;

    public ResponseEntity<Event> eventsPost() {
        // do some magic!
        return new ResponseEntity<Event>(HttpStatus.OK);
    }

}
