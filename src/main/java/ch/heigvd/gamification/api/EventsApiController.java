package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.EventDto;
import io.swagger.annotations.ApiParam;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class EventsApiController implements EventsApi {

    private RestClient restClient;

    public EventsApiController() {
        restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
    }

    public int postElastic(EventDto event) {
        try {

            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Posting to elasticsearch");

            HttpEntity entity = new NStringEntity(
                    "{\n" +
                    "    \"application_id\" : " + 3 + ",\n" +
                    "    \"type\" : \"" + event.getType() + "\",\n" +
                    "    \"user_id\" : " + event.getUser() + ",\n" +
                    "    \"post_date\" : \"" + event.getCreateDate() + "\"\n" +
                    "}", ContentType.APPLICATION_JSON);

            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Created entity: " + entity.toString());

            Response indexResponse = restClient.performRequest(
                    "POST",
                    "/gamification/event",
                    Collections.<String, String>emptyMap(),
                    entity);

            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Performed request, status code: " + indexResponse.getStatusLine().getStatusCode());

            return indexResponse.getStatusLine().getStatusCode();
        } catch (IOException e) {
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, "Error while performing the request");
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public ResponseEntity<EventDto> eventsPost(@ApiParam(value = "The infos from an event.", required = true) @RequestBody EventDto event) {
        postElastic(event);

        // TODO Checker les règles qui correspondent au type de l'événement

        // TODO Exécuter les actions correspondantes aux règles qui matchent

        // TODO Types d'actions: Update (scale point), Check (scale point value), Award (badge to user), Send (event)
        return null;
    }
}
