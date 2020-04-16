package com.SeQuorStudent.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class EnseignantFilierePK implements Serializable
{
    @Column(insertable=false, updatable=false)
    private long id_enseignant;

    @Column(insertable=false, updatable=false)
    private long id_filiere;


    public EnseignantFilierePK() {
    }

    public long getId_enseignant() {
        return id_enseignant;
    }

    public void setId_enseignant(long id_enseignant) {
        this.id_enseignant = id_enseignant;
    }

    public long getId_filiere() {
        return id_filiere;
    }

    public void setId_filiere(long id_filiere) {
        this.id_filiere = id_filiere;
    }

    @Override
    public String toString() {
        return "EnseignantFilierePK{" +
                "id_enseignant=" + id_enseignant +
                ", id_filiere=" + id_filiere +
                '}';
    }
}
