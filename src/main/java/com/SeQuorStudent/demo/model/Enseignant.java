package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Filiere;
import com.SeQuorStudent.demo.model.Module;
import com.SeQuorStudent.demo.model.Personne;
import com.SeQuorStudent.demo.model.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;


@Entity
@DiscriminatorValue("enseignant")
@Table(name = "enseignant")
public class Enseignant extends Personne implements Serializable
{

    private static final long serialVersionUID = 1L;



    private String grade;
    private String departement;

    @ManyToMany(mappedBy = "enseignantsmodule")
    private Set<Module> modulesenseigner ;

    @ManyToMany(mappedBy = "enseignantsfiliere")
    private Set<Filiere> filieresenseigner;

    @ManyToOne
    private Administrateur admin;

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

    public Set<Module> getModulesenseigner() {
        return modulesenseigner;
    }

    public void setModulesenseigner(Set<Module> modulesenseigner) {
        this.modulesenseigner = modulesenseigner;
    }

    public Set<Filiere> getFilieresenseigner() {
        return filieresenseigner;
    }

    public void setFilieresenseigner(Set<Filiere> filieresenseigner) {
        this.filieresenseigner = filieresenseigner;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
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
