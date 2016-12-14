package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.api.dto.Registration;
import org.springframework.data.repository.CrudRepository;

/**
 * Fichier: <nom>
 * Auteur: Brybry
 * Date de création: 12.12.2016
 * But: <but>
 */
public interface RegistrationsRepository extends CrudRepository<Registration, Long> {
    Iterable<Registration> findAll();
}
