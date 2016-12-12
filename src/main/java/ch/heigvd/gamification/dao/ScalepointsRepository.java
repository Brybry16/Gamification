package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.api.dto.ScalePoint;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface ScalepointsRepository extends CrudRepository<ScalePoint, Long> {
    void delete(ScalePoint scalePoint);
    ScalePoint findOne(String id);
    Iterable<ScalePoint> findAll();
}
