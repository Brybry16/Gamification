package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.models.Rule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by paulnta on 14.12.16.
 */
public interface RuleRepository extends CrudRepository<Rule, Long>{
    List<Rule> findByEventType(String eventType);
}
