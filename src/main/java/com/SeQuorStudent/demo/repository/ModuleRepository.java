package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.Module;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface ModuleRepository extends CrudRepository<Module,Long>
{
    Optional<Module> getAllById(Long id);

    Module getByNom(String nom);

    Optional<Module> getBySemestre(String semestre);
}
