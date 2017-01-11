package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.models.Registration;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Frederic on 1/11/2017.
 */
public interface RegistrationRepository  extends CrudRepository<Registration, Long> {
}
