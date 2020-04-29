package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Enseignant;
import com.SeQuorStudent.demo.model.Etudiant;
import com.SeQuorStudent.demo.model.Personne;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Entity
@DiscriminatorValue("administrateur")
@Table(name = "administrateur")
public class Administrateur extends Personne implements Serializable
{

    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "admin")
    private Set<Enseignant> enseignantsajouter ;

    @OneToMany(mappedBy = "admin")
    private Set<Etudiant> etudiantssuivi ;


    public Administrateur() {
    }

     //public Set<Enseignant> getEnseignantsajouter() {return enseignantsajouter;}

    public void setEnseignantsajouter(Set<Enseignant> enseignantsajouter) {
        this.enseignantsajouter = enseignantsajouter;
    }

    //public Set<Etudiant> getEtudiantssuivi() { return etudiantssuivi; }

    public void setEtudiantssuivi(Set<Etudiant> etudiantssuivi) {
        this.etudiantssuivi = etudiantssuivi;
    }

    @Override
    public String toString() {
        return "Administrateur{" +super.toString()+
            etudiantssuivi.toString();
    }
}
