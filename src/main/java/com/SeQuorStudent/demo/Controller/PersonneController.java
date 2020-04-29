package com.SeQuorStudent.demo.Controller;

import com.SeQuorStudent.demo.model.Personne;
import com.SeQuorStudent.demo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600) // pas important
@RequestMapping("/personnes")
public class PersonneController
{
    @Autowired
    PersonneRepository personnesRepository;

    //http://localhost:8080/personnes/all
    @GetMapping("/all")
    public  Iterable<Personne> getAllPersonnes()
    {
        return personnesRepository.findAll();
    }

    //http://localhost:8080/personnes/id
    @GetMapping("{id}")
    public Optional<Personne> getPersonneById(@PathVariable Long id)
    {
        return personnesRepository.findById(id);
    }

    //http://localhost:8080/personnes/add
    @PostMapping("/add")
    public Personne addPersonne(@RequestBody Personne personne)
    {
        return personnesRepository.save(personne);
    }

    //http://localhost:8080/personnes/id
    @DeleteMapping("{id}")
    public void deletePersonne(@PathVariable Long id)
    {
         personnesRepository.deleteById(id);
    }









}
