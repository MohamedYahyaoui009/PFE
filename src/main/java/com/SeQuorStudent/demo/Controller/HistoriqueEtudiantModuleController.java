package com.SeQuorStudent.demo.Controller;


import com.SeQuorStudent.demo.model.EtudiantFilierePK;
import com.SeQuorStudent.demo.model.EtudiantModulePK;
import com.SeQuorStudent.demo.model.HistoriqueEtudiantFiliere;
import com.SeQuorStudent.demo.model.HistoriqueEtudiantModule;
import com.SeQuorStudent.demo.repository.HistoriqueEtudiantModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*" , maxAge=3600)
@RequestMapping("/historiquesetudiantsmodules")
public class HistoriqueEtudiantModuleController
{
    @Autowired
    HistoriqueEtudiantModuleRepository historiqueEtudiantModuleRepository;

    //http://localhost:8080/historiquesetudiantsmodules/all
    @GetMapping("/all")
    public  Iterable<HistoriqueEtudiantModule> getAllHistoriqueEtudiantModule()
    {
        return historiqueEtudiantModuleRepository.findAll();
    }

    //http://localhost:8080/historiquesetudiantsmodules/id
    @GetMapping("{id}")
    public Optional<HistoriqueEtudiantModule> getHistoriqueEtudiantModuleById(@RequestBody EtudiantModulePK id)
    {
        return  historiqueEtudiantModuleRepository.findById(id);
    }

    //http://localhost:8080/historiquesetudiantsmodules/add
    @PostMapping("/add")
    public HistoriqueEtudiantModule addHistoriqueEtudiantModules(@RequestBody HistoriqueEtudiantModule historiqueEtudiantModule)
    {
        return historiqueEtudiantModuleRepository.save(historiqueEtudiantModule);
    }

    //http://localhost:8080/historiquesetudiantsmodules/id
    @DeleteMapping("{id}")
    public void deleteHistoriqueEtudiantModule(@RequestBody EtudiantModulePK id)
    {
        historiqueEtudiantModuleRepository.deleteById(id);
    }





}
