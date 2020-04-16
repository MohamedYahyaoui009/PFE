package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.model.Etudiant;
import com.SeQuorStudent.demo.model.Filiere;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

@Entity
@DiscriminatorValue("module")
@Table(name = "module")
public class Module implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_module")
    private long id;
    private String nom;
    private int semestre;

    @ManyToMany
    private Set<Filiere> filieremodule;

    @ManyToMany
    private Set<Etudiant> etudiantsmodule;

    @ManyToMany
    private Set<Enseignant> enseignantsmodule;

    public Module(long id, String nom, int semestre, Set<Filiere> filieremodule, Set<Etudiant> etudiantsmodule, Set<Enseignant>  enseignantsmodule) {
        this.id = id;
        this.nom = nom;
        this.semestre = semestre;
        this.filieremodule = filieremodule;
        this.etudiantsmodule = etudiantsmodule;
        this.enseignantsmodule = enseignantsmodule;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


    public Set<Etudiant> getEtudiantsmodule() {
        return etudiantsmodule;
    }

    public void setEtudiantsmodule(Set<Etudiant> etudiantsmodule) {
        this.etudiantsmodule = etudiantsmodule;
    }

    public Set<Enseignant> getEnseignantsmodule() {
        return enseignantsmodule;
    }

    public void setEnseignantsmodule(Set<Enseignant> enseignantsmodule) {
        this.enseignantsmodule = enseignantsmodule;
    }

    public Set<Filiere> getFilieremodule() {
        return filieremodule;
    }

    public void setFilieremodule(Set<Filiere> filieremodule) {
        this.filieremodule = filieremodule;
    }

    @Override
    public String toString() {
        return "Module{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", semestre=" + semestre +
                ", filieremodule=" + filieremodule +
                ", etudiantsmodule=" + etudiantsmodule +
                ", enseignantsmodule=" + enseignantsmodule +
                '}';
    }
}
