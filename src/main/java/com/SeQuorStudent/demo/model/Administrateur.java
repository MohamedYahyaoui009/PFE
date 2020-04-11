package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Date;
import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.model.Etudiant;
import com.SeQuorStudent.demo.model.Personne;

import java.util.ArrayList;

public class Administrateur extends Personne
{
    private ArrayList<Enseignant> enseignantsajouter ;
    private ArrayList<Etudiant> etudiantssuivi ;

    public Administrateur(String nom, String prenom, Date datenaissance, String email, String cin, String login, String password, String id, int tel) {
        super(nom, prenom, datenaissance, email, cin, login, password, id, tel);
    }

    public Administrateur(String nom, String prenom, Date datenaissance, String email, String cin, String login, String password, String id, int tel, ArrayList<Enseignant> enseignantsajouter, ArrayList<Etudiant> etudiantssuivi) {
        super(nom, prenom, datenaissance, email, cin, login, password, id, tel);
        this.enseignantsajouter = enseignantsajouter;
        this.etudiantssuivi = etudiantssuivi;
    }

    public ArrayList<Enseignant> getEnseignantsajouter() {
        return enseignantsajouter;
    }

    public void setEnseignantsajouter(ArrayList<Enseignant> enseignantsajouter) {
        this.enseignantsajouter = enseignantsajouter;
    }

    public ArrayList<Etudiant> getEtudiantssuivi() {
        return etudiantssuivi;
    }

    public void setEtudiantssuivi(ArrayList<Etudiant> etudiantssuivi) {
        this.etudiantssuivi = etudiantssuivi;
    }

    @Override
    public String toString() {
        return "Administrateur{" +super.toString()+
            etudiantssuivi.toString();
    }
}
