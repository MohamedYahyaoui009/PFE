package com.SeQuorStudent.demo.Controller;

import com.SeQuorStudent.demo.model.*;
import com.SeQuorStudent.demo.repository.HistoriqueEnseignantModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/historiquesenseignantmodules")
public class HistoriqueEnseignantModuleController
{
    @Autowired
    HistoriqueEnseignantModuleRepository historiqueEnseignantModuleRepository;


    //http://localhost:8080/historiquesenseignantmodules/all
    @GetMapping("/all")
    public  Iterable<HistoriqueEnseignantModule> getAllHistoriqueEnseignanttModule()
    {
        return historiqueEnseignantModuleRepository.findAll();
    }

    //http://localhost:8080/historiquesenseignantmodules/id
    @GetMapping("{id}")
    public Optional<HistoriqueEnseignantModule> getHistoriqueEnseignantModuleById(@RequestBody EnseignantModulePK id)
    {
        return  historiqueEnseignantModuleRepository.findById(id);
    }

    //http://localhost:8080/historiquesenseignantmodules/add
    @PostMapping("/add")
    public HistoriqueEnseignantModule addHistoriqueEnseignantModules(@RequestBody HistoriqueEnseignantModule historiqueEnseignantModule)
    {
        return historiqueEnseignantModuleRepository.save(historiqueEnseignantModule);
    }

    //http://localhost:8080/historiquesenseignantsmodules/id
    @DeleteMapping("{id}")
    public void deleteHistoriqueEnseignantModule(@RequestBody EnseignantModulePK id)
    {
        historiqueEnseignantModuleRepository.deleteById(id);
    }

}
