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
    private Set<Filiere> filieres;

    @ManyToMany
    private Set<Etudiant> etudiants;

    @ManyToMany
    private Set<Enseignant> enseignants;

    public Module(long id, String nom, int semestre, Set<Filiere> filieres, Set<Etudiant> etudiants, Set<Enseignant>  enseignants) {
        this.id = id;
        this.nom = nom;
        this.semestre = semestre;
        this.filieres = filieres;
        this.etudiants = etudiants;
        this.enseignants = enseignants;
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
        return etudiants;
    }

    public void setEtudiantsmodule(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Set<Enseignant> getEnseignantsmodule() {
        return enseignants;
    }

    public void setEnseignantsmodule(Set<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    public Set<Filiere> getFilieremodule() {
        return filieres;
    }

    public void setFilieremodule(Set<Filiere> filieremodule) {
        this.filieres = filieremodule;
    }

    @Override
    public String toString() {
        return "Module{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", semestre=" + semestre +
                ", filieremodule=" + filieres +
                ", etudiantsmodule=" + etudiants +
                ", enseignantsmodule=" + enseignants +
                '}';
    }
}
