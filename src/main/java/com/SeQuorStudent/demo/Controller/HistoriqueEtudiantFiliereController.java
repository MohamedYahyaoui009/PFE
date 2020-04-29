package com.SeQuorStudent.demo.Controller;


import com.SeQuorStudent.demo.model.EtudiantFilierePK;
import com.SeQuorStudent.demo.model.HistoriqueEtudiantFiliere;
import com.SeQuorStudent.demo.repository.HistoriqueEtudiantFiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/historiquesetudiantsfiliere")
public class HistoriqueEtudiantFiliereController
{
    @Autowired
    HistoriqueEtudiantFiliereRepository historiqueEtudiantFiliereRepository;

    //http://localhost:8080/historiquesetudiantfiliere/all
    @GetMapping("/all")
    public  Iterable<HistoriqueEtudiantFiliere> getAllHistoriqueEtudiantFiliere()
    {
        return historiqueEtudiantFiliereRepository.findAll();
    }

    //http://localhost:8080/historiquesetudiantsfiliere/id
    @GetMapping("{id}")
    public Optional<HistoriqueEtudiantFiliere> getHistoriqueEtudiantFiliereById(@RequestBody EtudiantFilierePK id)
    {
        return  historiqueEtudiantFiliereRepository.findById(id);
    }

    //http://localhost:8080/historiquesetudiantsfiliere/add
    @PostMapping("/add")
    public HistoriqueEtudiantFiliere addHistoriqueEtudiantFiliere(@RequestBody HistoriqueEtudiantFiliere historiqueEtudiantFiliere)
    {
        return historiqueEtudiantFiliereRepository.save(historiqueEtudiantFiliere);
    }

    //http://localhost:8080/historiquesetudiantsfiliere/id
    @DeleteMapping("{id}")
    public void deleteHistoriquEtudiantFiliere(@RequestBody EtudiantFilierePK id)
    {
        historiqueEtudiantFiliereRepository.deleteById(id);
    }
}
