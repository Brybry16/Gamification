package ch.heigvd.gamification.api;

import ch.heigvd.gamification.api.dto.Event;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T19:25:34.698+01:00")

@Controller
public class EventsApiController implements EventsApi {

    private RestClient restClient;

    public EventsApiController() {
        restClient = RestClient.builder(
                new HttpHost("evtdb", 9200, "http"),
                new HttpHost("evtdb", 9300, "http")).build();
    }

    public int postElastic() {
        try {

            TimeZone tz = TimeZone.getTimeZone("UTC");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
            df.setTimeZone(tz);
            String isoDate = df.format(new Date());

            HttpEntity entity = new NStringEntity(
                    "{\n" +
                    "    \"application_id\" : " + 3 + ",\n" +
                    "    \"type\" : \"" + "Point" + "\",\n" +
                    "    \"user_id\" : " + 32 + ",\n" +
                    "    \"post_date\" : \"" + isoDate + "\"\n" +
                    "}", ContentType.APPLICATION_JSON);
            Response indexResponse = restClient.performRequest(
                    "POST",
                    "/gamification/event",
                    Collections.<String, String>emptyMap(),
                    entity);

            return indexResponse.getStatusLine().getStatusCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public ResponseEntity<Event> eventsPost() {
        return null;
    }
}
