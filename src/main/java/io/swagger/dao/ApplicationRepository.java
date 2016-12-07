package io.swagger.dao;

import io.swagger.model.Badge;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Badge, Long> {
    Badge findByName(String name);
}
