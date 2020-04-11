package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.model.Etudiant;
import com.SeQuorStudent.demo.model.Filiere;

import javax.persistence.*;
import java.util.ArrayList;


public class Module {

    private String id;
    private String nom;
    private int semestre;


    private ArrayList<Filiere> filieremodule;


    ArrayList<Etudiant> etudiantsmodule;


    ArrayList<Enseignant> enseignantsmodule;

    public Module(String id, String nom, int semestre) {
        this.id = id;
        this.nom = nom;
        this.semestre = semestre;
    }

    public Module(String id, String nom, int semestre, ArrayList<Enseignant> enseignantsmodule) {
        this.id = id;
        this.nom = nom;
        this.semestre = semestre;
        this.enseignantsmodule = enseignantsmodule;
    }

    public Module(String id, String nom, int semestre, ArrayList<Filiere> filieremodule, ArrayList<Etudiant> etudiantsmodule, ArrayList<Enseignant> enseignantsmodule) {
        this.id = id;
        this.nom = nom;
        this.semestre = semestre;
        this.filieremodule = filieremodule;
        this.etudiantsmodule = etudiantsmodule;
        this.enseignantsmodule = enseignantsmodule;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


    public ArrayList<Etudiant> getEtudiantsmodule() {
        return etudiantsmodule;
    }

    public void setEtudiantsmodule(ArrayList<Etudiant> etudiantsmodule) {
        this.etudiantsmodule = etudiantsmodule;
    }

    public ArrayList<Enseignant> getEnseignantsmodule() {
        return enseignantsmodule;
    }

    public void setEnseignantsmodule(ArrayList<Enseignant> enseignantsmodule) {
        this.enseignantsmodule = enseignantsmodule;
    }

    public ArrayList<Filiere> getFilieremodule() {
        return filieremodule;
    }

    public void setFilieremodule(ArrayList<Filiere> filieremodule) {
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
