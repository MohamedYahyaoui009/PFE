package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.*;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface HistoriqueEtudiantModuleRepository extends CrudRepository<HistoriqueEtudiantModule, EtudiantModulePK>
{
    Optional<HistoriqueEtudiantModule> getAllByID(EtudiantModulePK ID);

    Optional<HistoriqueEtudiantModule> getByDatedebut(Date datedebut);

    Optional<HistoriqueEtudiantModule> getByDatefin(Date datefin);

    Optional<HistoriqueEtudiantModule> getByNote(float note);

}
