package ch.heigvd.gamification.repositories;

import ch.heigvd.gamification.dao.Badge;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Frederic on 1/9/2017.
 */
public interface BadgeRepository extends CrudRepository<Badge, Long> {
}
