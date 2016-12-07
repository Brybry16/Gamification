package io.swagger.dao;

import io.swagger.model.Badge;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface BadgeRepository extends CrudRepository<Badge, Long> {
    Badge findByName(String name);
    Badge findOne(BigDecimal id);
    void delete(Badge badge);
    Iterable<Badge> findAll();
}
