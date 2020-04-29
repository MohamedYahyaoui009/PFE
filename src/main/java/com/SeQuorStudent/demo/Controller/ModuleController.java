package com.SeQuorStudent.demo.Controller;


import com.SeQuorStudent.demo.model.Module;
import com.SeQuorStudent.demo.repository.HistoriqueEnseignantModuleRepository;
import com.SeQuorStudent.demo.repository.HistoriqueEtudiantModuleRepository;
import com.SeQuorStudent.demo.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/modules")
public class ModuleController
{
    @Autowired
    ModuleRepository moduleRepository;


    //http://localhost:8080/modules/all
    @GetMapping("/all")
    public  Iterable<Module> getAllModules()
    {
        return moduleRepository.findAll();
    }

    //http://localhost:8080/modules/id
    @GetMapping("{id}")
    public Optional<Module> getModulesById(@PathVariable long id)
    {
        return moduleRepository.findById(id);
    }

    //http://localhost:8080/modules/add
    @PostMapping("/add")
    public Module addModule(@RequestBody Module module)
    {
        return moduleRepository.save(module);
    }

    //http://localhost:8080/modules/id
    @DeleteMapping("{id}")
    public void deleteModule(@PathVariable Long id)
    {
        moduleRepository.deleteById(id);
    }
}
