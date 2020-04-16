package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Filiere;
import com.SeQuorStudent.demo.model.Module;
import com.SeQuorStudent.demo.model.Personne;
import com.SeQuorStudent.demo.model.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;


@Entity
@DiscriminatorValue("etudiant")
@Table(name = "etudiant")
public class Etudiant extends  Personne implements Serializable
{

    private static final long serialVersionUID = 1L;


    private String section;
    private String semsetre;

    @ManyToOne
    private Filiere filiere;

    @ManyToMany(mappedBy = "etudiantsmodule")
    private Set<Module> modules;


    @ManyToOne
    private Administrateur admin;


    public Etudiant() {
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

    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
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
