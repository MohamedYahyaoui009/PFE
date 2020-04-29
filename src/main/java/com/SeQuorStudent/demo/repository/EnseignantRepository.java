package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.model.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EnseignantRepository extends CrudRepository<Enseignant,Long>
{
    Optional<Enseignant> getAllById(Long id);

    Enseignant getByLogin(String login);

    Enseignant getByPassword(String password);

    Enseignant getByCin(String cin);

    Enseignant getByEmail(String email);

    Optional<Enseignant> getAllByGrade(String grade);

    Optional<Enseignant> getAllByDepartement(String departement);

}
