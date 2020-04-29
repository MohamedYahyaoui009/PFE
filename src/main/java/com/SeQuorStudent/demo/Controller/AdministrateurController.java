package com.SeQuorStudent.demo.Controller;

import com.SeQuorStudent.demo.model.Administrateur;
import com.SeQuorStudent.demo.model.Personne;
import com.SeQuorStudent.demo.repository.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/administrateurs")
public class AdministrateurController
{
    @Autowired
    AdministrateurRepository administrateurRepository;

    //http://localhost:8080/administrateurs/all
    @GetMapping("/all")
    public  Iterable<Administrateur> getAllAdministrateurs()
    {
        return administrateurRepository.findAll();
    }

    //http://localhost:8080/administrateurs/id
    @GetMapping("{id}")
    public Optional<Administrateur> getAdministrateurById(@PathVariable long id)
    {
        return administrateurRepository.findById(id);
    }

    //http://localhost:8080/administrateurs/add
    @PostMapping("/add")
    public Administrateur addAdministrateur(@RequestBody Administrateur administrateur)
    {
        return administrateurRepository.save(administrateur);
    }

    //http://localhost:8080/administrateurs/id
    @DeleteMapping("{id}")
    public void deleteAdministrateur(@PathVariable Long id)
    {
        administrateurRepository.deleteById(id);
    }
}
