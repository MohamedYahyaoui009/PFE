package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.model.Etudiant;
import com.SeQuorStudent.demo.model.Module;

import java.util.ArrayList;

public class Filiere
{
    private String id;
    private String nom;
    private String chefFiliere;
    private String departement;

    ArrayList<Module> modulesfiliere;
    ArrayList<Etudiant> etudiantsfiliere;
    ArrayList<Enseignant> enseignantsfiliere;

    public Filiere(String id, String nom, String chefFiliere, String departement) {
        this.id = id;
        this.nom = nom;
        this.chefFiliere = chefFiliere;
        this.departement = departement;
    }

    public Filiere(String id, String nom, String chefFiliere, String departement, ArrayList<Module> modulesfiliere, ArrayList<Etudiant> etudiantsfiliere, ArrayList<Enseignant> enseignantsfiliere) {
        this.id = id;
        this.nom = nom;
        this.chefFiliere = chefFiliere;
        this.departement = departement;
        this.modulesfiliere = modulesfiliere;
        this.etudiantsfiliere = etudiantsfiliere;
        this.enseignantsfiliere = enseignantsfiliere;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public ArrayList<Module> getModulesfiliere() {
        return modulesfiliere;
    }

    public void setModulesfiliere(ArrayList<Module> modulesfiliere) {
        this.modulesfiliere = modulesfiliere;
    }

    public ArrayList<Etudiant> getEtudiantsfiliere() {
        return etudiantsfiliere;
    }

    public void setEtudiantsfiliere(ArrayList<Etudiant> etudiantsfiliere) {
        this.etudiantsfiliere = etudiantsfiliere;
    }

    public ArrayList<Enseignant> getEnseignantsfiliere() {
        return enseignantsfiliere;
    }

    public void setEnseignantsfiliere(ArrayList<Enseignant> enseignantsfiliere) {
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