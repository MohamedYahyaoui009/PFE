package com.SeQuorStudent.demo.Controller;

import com.SeQuorStudent.demo.model.*;
import com.SeQuorStudent.demo.repository.EtudiantRepository;
import com.SeQuorStudent.demo.repository.HistoriqueEtudiantFiliereRepository;
import com.SeQuorStudent.demo.repository.HistoriqueEtudiantModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/etudiants")
public class EtudiantController
{
    @Autowired
    EtudiantRepository etudiantRepository;


    //http://localhost:8080/etudiants/all
    @GetMapping("/all")
    public  Iterable<Etudiant> getAllEtudiants()
    {
        return etudiantRepository.findAll();
    }

    //http://localhost:8080/etudiants/id
    @GetMapping("{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable long id)
    {
        return etudiantRepository.findById(id);
    }

    //http://localhost:8080/etudiants/add
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant)
    {
        return etudiantRepository.save(etudiant);
    }

    //http://localhost:8080/etudiants/id
    @DeleteMapping("{id}")
    public void deleteEtudiant(@PathVariable Long id)
    {
        etudiantRepository.deleteById(id);
    }

}
