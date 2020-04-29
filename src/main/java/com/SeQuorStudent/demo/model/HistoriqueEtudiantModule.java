package com.SeQuorStudent.demo.model;

import javax.persistence.*;
import java.util.*;

@Entity
@DiscriminatorValue("historiqueetudiantmodule")
@Table(name = "historiqueetudiantmodule")
public class HistoriqueEtudiantModule
{
    @EmbeddedId
    private EtudiantModulePK ID ;

    @Temporal(TemporalType.DATE)
    private Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;

    private float note;

    public HistoriqueEtudiantModule() {
    }

    public EtudiantModulePK getID() {
        return ID;
    }

    public void setID(EtudiantModulePK ID) {
        this.ID = ID;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date date_debut) {
        this.datedebut = date_debut;
    }

    public Date getDate_fin() {
        return datefin;
    }

    public void setDatefin(Date date_fin) {
        this.datefin = date_fin;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "HistoriqueEtudiantModule{" +
                "ID=" + ID +
                ", datedebut=" + datedebut +
                ", datefin=" + datefin +
                ", note=" + note +
                '}';
    }
}

