package com.SeQuorStudent.demo.Controller;

import com.SeQuorStudent.demo.model.EnseignantFilierePK;
import com.SeQuorStudent.demo.model.HistoriqueEnseignantFiliere;
import com.SeQuorStudent.demo.repository.HistoriqueEnseignantFiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/historiquesenseignantfilieres")
public class HistoriqueEnseignantFiliereController
{
    @Autowired
    HistoriqueEnseignantFiliereRepository historiqueEnseignantFiliereRepository;

    //http://localhost:8080/historiquesenseignantfilieres/all
    @GetMapping("/all")
    public  Iterable<HistoriqueEnseignantFiliere> getAllHistoriqueEnseignanttFiliere()
    {
        return historiqueEnseignantFiliereRepository.findAll();
    }

    //http://localhost:8080/historiquesenseignantfilieres/id
    @GetMapping("{id}")
    public Optional<HistoriqueEnseignantFiliere> getHistoriqueEnseignantFiliereById(@RequestBody EnseignantFilierePK id)
    {
        return  historiqueEnseignantFiliereRepository.findById(id);
    }

    //http://localhost:8080/historiquesenseignantfilieres/add
    @PostMapping("/add")
    public HistoriqueEnseignantFiliere addHistoriqueEnseignantFilieres(@RequestBody HistoriqueEnseignantFiliere historiqueEnseignantFiliere)
    {
        return historiqueEnseignantFiliereRepository.save(historiqueEnseignantFiliere);
    }

    //http://localhost:8080/historiquesenseignantsfilieres/id
    @DeleteMapping("{id}")
    public void deleteHistoriqueEnseignantFiliere(@RequestBody EnseignantFilierePK id)
    {
        historiqueEnseignantFiliereRepository.deleteById(id);
    }


}
