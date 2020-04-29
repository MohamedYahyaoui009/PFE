package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.Filiere;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface FiliereRepository extends CrudRepository<Filiere,Long>
{
    Optional<Filiere> getAllById(Long id);

    Filiere getByNom(String nom);

    Filiere getByChefFiliere(String chefFiliere);

    Filiere getByDepartement(String departement);

}
