package com.SeQuorStudent.demo.Controller;



import com.SeQuorStudent.demo.model.Filiere;
import com.SeQuorStudent.demo.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/filieres")
public class FiliereController
{
    @Autowired
    FiliereRepository filiereRepository;


    //http://localhost:8080/filieres/all
    @GetMapping("/all")
    public  Iterable<Filiere> getAllFilieres()
    {
        return filiereRepository.findAll();
    }

    //http://localhost:8080/filieres/id
    @GetMapping("{id}")
    public Optional<Filiere> getFiliereById(@PathVariable long id)
    {
        return filiereRepository.findById(id);
    }


    //http://localhost:8080/filieres/add
    @PostMapping("/add")
    public Filiere addFiliere(@RequestBody Filiere filiere)
    {
        return filiereRepository.save(filiere);
    }

    //http://localhost:8080/filieres/id
    @DeleteMapping("{id}")
    public void deleteFiliere(@PathVariable Long id)
    {
        filiereRepository.deleteById(id);
    }
}
