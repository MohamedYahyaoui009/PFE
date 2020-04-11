package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Filiere;
import com.SeQuorStudent.demo.model.Module;
import com.SeQuorStudent.demo.model.Personne;
import com.SeQuorStudent.demo.model.*;

import java.util.ArrayList;

public class Enseignant extends Personne
{
    private String grade;
    private String departement;

    private ArrayList<Module> modulesenseigner ;
    private ArrayList<Filiere> filieresenseigner;

    private Administrateur adminen;

    public Enseignant() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public ArrayList<Module> getModulesenseigner() {
        return modulesenseigner;
    }

    public void setModulesenseigner(ArrayList<Module> modulesenseigner) {
        this.modulesenseigner = modulesenseigner;
    }

    public ArrayList<Filiere> getFilieresenseigner() {
        return filieresenseigner;
    }

    public void setFilieresenseigner(ArrayList<Filiere> filieresenseigner) {
        this.filieresenseigner = filieresenseigner;
    }

    public Administrateur getAdminen() {
        return adminen;
    }

    public void setAdminen(Administrateur adminen) {
        this.adminen = adminen;
    }

    @Override
    public String toString() {
        return "Enseignant{" + super.toString()+
                "grade='" + grade + '\'' +
                ", departement='" + departement + '\'' +
                ", modulesenseigner=" + modulesenseigner.toString() +
                ", filieresenseigner=" + filieresenseigner.toString() +
                '}';
    }
}
