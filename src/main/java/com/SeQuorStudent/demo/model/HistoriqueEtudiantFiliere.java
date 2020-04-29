package com.SeQuorStudent.demo.model;


import javax.persistence.*;
import java.util.*;

@Entity
@DiscriminatorValue("historiqueetudiantfiliere")
@Table(name = "historiqueetudiantfiliere")
public class HistoriqueEtudiantFiliere
{
    @EmbeddedId
    private EtudiantFilierePK ID;

    @Temporal(TemporalType.DATE)
    private Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;

    public HistoriqueEtudiantFiliere() {
    }

    public EtudiantFilierePK getID() {
        return ID;
    }

    public void setID(EtudiantFilierePK ID) {
        this.ID = ID;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    @Override
    public String toString() {
        return "EtudiantFiliere{" +
                "ID=" + ID +
                ", datedebut=" + datedebut +
                ", datefin=" + datefin +
                '}';
    }
}
