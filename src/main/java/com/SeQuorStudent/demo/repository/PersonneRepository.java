package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface PersonneRepository extends CrudRepository<Personne,Long>
{
    Optional<Personne> getAllById(Long id);

    Personne getByLogin(String login);

    Personne getByPassword(String password);

    Personne getByCin(String cin);

    Personne getByEmail(String email);

}
