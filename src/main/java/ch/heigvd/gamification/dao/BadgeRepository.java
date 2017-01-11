package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.models.Badge;
import org.springframework.data.repository.CrudRepository;

public interface BadgeRepository extends CrudRepository<Badge, Long> {
}
