package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.api.dto.Badge;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

/**
 * Fichier: <nom>
 * Auteur: Brybry
 * Date de création: 12.12.2016
 * But: <but>
 */
public interface BadgesRepository extends CrudRepository<Badge, Long> {
    Badge findByName(String name);
    Badge findOne(BigDecimal id);
    void delete(Badge badge);
    Iterable<Badge> findAll();
}
