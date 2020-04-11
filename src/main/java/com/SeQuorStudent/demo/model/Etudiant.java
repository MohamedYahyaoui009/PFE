package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Filiere;
import com.SeQuorStudent.demo.model.Module;
import com.SeQuorStudent.demo.model.Personne;
import com.SeQuorStudent.demo.model.*;

import java.util.ArrayList;

public class Etudiant extends  Personne
{
    private String section;
    private String semsetre;

    private Filiere filiere;

    private ArrayList<Module> modules;

    private Administrateur admin;


    public Etudiant(String nom, String prenom, Date datenaissance, String email, String cin, String login, String password, long id, int tel, String section, String semsetre, Filiere filiere, ArrayList<Module> modules, Administrateur admin) {
        super(nom, prenom, datenaissance, email, cin, login, password, id, tel);
        this.section = section;
        this.semsetre = semsetre;
        this.filiere = filiere;
        this.modules = modules;
        this.admin = admin;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSemsetre() {
        return semsetre;
    }

    public void setSemsetre(String semsetre) {
        this.semsetre = semsetre;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Etudiant{" + super.toString()+
                "section='" + section + '\'' +
                ", semsetre='" + semsetre + '\'' +
                ", filiere=" + filiere +
                ", modules=" + modules.toString() +
                '}';
    }
}
