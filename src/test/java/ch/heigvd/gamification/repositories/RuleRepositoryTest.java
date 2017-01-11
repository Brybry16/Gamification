package ch.heigvd.gamification.repositories;

import ch.heigvd.gamification.dao.RuleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringRunner.class)
public class RuleRepositoryTest {

    @Autowired
    private RuleRepository repository;

    @Test
    public void shouldSaveRule() {
        assertNotNull(repository);
    }
}
