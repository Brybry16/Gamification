package io.swagger.dao;

import io.swagger.model.ScalePoint;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface ScalepointRepository extends CrudRepository<ScalePoint, Long> {
    void delete(ScalePoint scalePoint);
    ScalePoint findOne(BigDecimal id);
    Iterable<ScalePoint> findAll();
}
