package com.SeQuorStudent.demo.repository;

import com.SeQuorStudent.demo.model.Etudiant;
import com.SeQuorStudent.demo.model.EtudiantFilierePK;
import com.SeQuorStudent.demo.model.HistoriqueEtudiantFiliere;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface EtudiantRepository extends CrudRepository<Etudiant,Long>
{
    Optional<Etudiant> getAllById(Long id);

    Etudiant getByLogin(String login);

    Etudiant getByPassword(String password);

    Etudiant getByCin(String cin);

    Etudiant getByEmail(String email);

    Optional<Etudiant> getAllBySection(String section);

    Optional<Etudiant> getAllBySemestre(int semestre);

    Optional<Etudiant> getAllByFiliere(String  filiere);

}
