package ch.heigvd.gamification.repositories;

import ch.heigvd.gamification.dao.Rule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by paulnta on 14.12.16.
 */
public interface RuleRepository extends CrudRepository<Rule, Long>{
    List<Rule> findByEventType(String eventType);
}
