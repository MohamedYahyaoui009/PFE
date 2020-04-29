package com.SeQuorStudent.demo.repository;


import com.SeQuorStudent.demo.model.EnseignantModulePK;
import com.SeQuorStudent.demo.model.HistoriqueEnseignantModule;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface HistoriqueEnseignantModuleRepository extends CrudRepository<HistoriqueEnseignantModule, EnseignantModulePK>
{
    Optional<HistoriqueEnseignantModule> getAllByID(EnseignantModulePK ID);

    Optional<HistoriqueEnseignantModule> getByDatedebut(Date datedebut);

    Optional<HistoriqueEnseignantModule> getByDatefin(Date datefin);
}
