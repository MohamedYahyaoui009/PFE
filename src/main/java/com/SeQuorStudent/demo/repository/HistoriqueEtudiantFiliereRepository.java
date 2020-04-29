package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.*;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface HistoriqueEtudiantFiliereRepository extends CrudRepository<HistoriqueEtudiantFiliere, EtudiantFilierePK>
{
    Optional<HistoriqueEtudiantFiliere> getAllByID(EtudiantFilierePK ID);

    Optional<HistoriqueEtudiantFiliere> getByDatedebut(Date datedebut);

    Optional<HistoriqueEtudiantFiliere> getByDatefin(Date datefin);

}
