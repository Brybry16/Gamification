package io.swagger.dao;

import io.swagger.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventsRepository extends CrudRepository<Event, Long> {
}
