package io.swagger.dao;

import io.swagger.model.Registration;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationsRepository extends CrudRepository<Registration, Long> {
    Iterable<Registration> findAll();
}
