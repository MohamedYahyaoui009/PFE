package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.Administrateur;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdministrateurRepository extends CrudRepository<Administrateur,Long>
{
    Optional<Administrateur> getAllById(Long id);
}
