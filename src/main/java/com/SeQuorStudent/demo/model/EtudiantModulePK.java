package com.SeQuorStudent.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class EtudiantModulePK implements Serializable
{

    @Column(insertable=false, updatable=false)
    private long id_etudiant;

    @Column(insertable=false, updatable=false)
    private  long id_module;

    public EtudiantModulePK() {
    }


    public long getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(long id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public long getId_module() {
        return id_module;
    }

    public void setId_module(long id_module) {
        this.id_module = id_module;
    }


    @Override
    public String toString() {
        return "EtudiantModulePK{" +
                "id_etudiant=" + id_etudiant +
                ", id_module=" + id_module +
                '}';
    }
}
