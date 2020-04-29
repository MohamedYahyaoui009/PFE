package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.EnseignantFilierePK;
import com.SeQuorStudent.demo.model.HistoriqueEnseignantFiliere;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface HistoriqueEnseignantFiliereRepository extends CrudRepository<HistoriqueEnseignantFiliere, EnseignantFilierePK>
{
    Optional<HistoriqueEnseignantFiliere> getAllByID(EnseignantFilierePK ID);

    Optional<HistoriqueEnseignantFiliere> getByDatedebut(Date datedebut);

    Optional<HistoriqueEnseignantFiliere> getByDatefin(Date datefin);
}
