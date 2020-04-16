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

    @ManyToMany(mappedBy = "filieremodule")
    Set<Module> modulesfiliere;

    @OneToMany(mappedBy ="filiere")
    Set<Etudiant> etudiantsfiliere;

    @ManyToMany
    Set<Enseignant> enseignantsfiliere;

    public Filiere(long id, String nom, String chefFiliere, String departement, Set<Module> modulesfiliere, Set<Etudiant> etudiantsfiliere, Set<Enseignant> enseignantsfiliere) {
        this.id = id;
        this.nom = nom;
        this.chefFiliere = chefFiliere;
        this.departement = departement;
        this.modulesfiliere = modulesfiliere;
        this.etudiantsfiliere = etudiantsfiliere;
        this.enseignantsfiliere = enseignantsfiliere;
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
        return modulesfiliere;
    }

    public void setModulesfiliere(Set<Module> modulesfiliere) {
        this.modulesfiliere = modulesfiliere;
    }

    public Set<Etudiant> getEtudiantsfiliere() {
        return etudiantsfiliere;
    }

    public void setEtudiantsfiliere(Set<Etudiant> etudiantsfiliere) {
        this.etudiantsfiliere = etudiantsfiliere;
    }

    public Set<Enseignant> getEnseignantsfiliere() {
        return enseignantsfiliere;
    }

    public void setEnseignantsfiliere(Set<Enseignant> enseignantsfiliere) {
        this.enseignantsfiliere = enseignantsfiliere;
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
