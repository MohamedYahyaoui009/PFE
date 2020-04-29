package com.SeQuorStudent.demo.Controller;


import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/enseignants")
public class EnseignantController
{
    @Autowired
    EnseignantRepository enseignantRepository;


    //http://localhost:8080/enseignants/all
    @GetMapping("/all")
    public  Iterable<Enseignant> getAllEnseignants()
    {
        return enseignantRepository.findAll();
    }

    //http://localhost:8080/enseignants/id
    @GetMapping("{id}")
    public Optional<Enseignant> getEnseignantById(@PathVariable long id)
    {
        return enseignantRepository.findById(id);
    }

    //http://localhost:8080/enseignants/add
    @PostMapping("/add")
    public Enseignant addEnseignant(@RequestBody Enseignant enseignant)
    {
        return enseignantRepository.save(enseignant);
    }

    //http://localhost:8080/enseignants/id
    @DeleteMapping("{id}")
    public void daleteEnseignant(@PathVariable Long id)
    {
        enseignantRepository.deleteById(id);
    }

}
