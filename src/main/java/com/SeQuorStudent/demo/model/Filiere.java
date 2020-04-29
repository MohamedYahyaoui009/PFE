package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.model.Etudiant;
import com.SeQuorStudent.demo.model.Module;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@DiscriminatorValue("filiere")
@Table(name = "filiere")
public class Filiere implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_filiere")
    private long id;
    private String nom;
    private String chefFiliere;
    private String departement;

    @ManyToMany(mappedBy = "filieres")
    Set<Module> modules;

    @OneToMany(mappedBy ="filiere")
    Set<Etudiant> etudiants;

    @ManyToMany
    Set<Enseignant> enseignants;

    public Filiere() {
    }

    public Filiere(long id, String nom, String chefFiliere, String departement, Set<Module> modules, Set<Etudiant> etudiant, Set<Enseignant> enseignants) {
        this.id = id;
        this.nom = nom;
        this.chefFiliere = chefFiliere;
        this.departement = departement;
        this.modules = modules;
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

    public String getChefFiliere() {
        return chefFiliere;
    }

    public void setChefFiliere(String chefFiliere) {
        this.chefFiliere = chefFiliere;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Set<Module> getModulesfiliere() {
        return modules;
    }

    public void setModulesfiliere(Set<Module> modules) {
        this.modules = modules;
    }

    //public Set<Etudiant> getEtudiantsfiliere() {  return etudiants; }

    public void setEtudiantsfiliere(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Set<Enseignant> getEnseignantsfiliere() {
        return enseignants;
    }

    public void setEnseignantsfiliere(Set<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    @Override
    public String toString() {
        return "Filiere{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", chefFiliere='" + chefFiliere + '\'' +
                ", departement='" + departement + '\'' +
                '}';
    }
}
