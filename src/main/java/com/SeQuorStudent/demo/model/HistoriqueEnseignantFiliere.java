package com.SeQuorStudent.demo.model;


import javax.persistence.*;
import java.util.*;

@Entity
@DiscriminatorValue("historiqueenseignantfiliere")
@Table(name = "historiqueenseignantfiliere")
public class HistoriqueEnseignantFiliere {

    @EmbeddedId
    private EnseignantFilierePK ID;

    @Temporal(TemporalType.DATE)
    private  Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;


    public HistoriqueEnseignantFiliere() {
    }


    public EnseignantFilierePK getID() {
        return ID;
    }

    public void setID(EnseignantFilierePK ID) {
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

    public void setDatefin(Date date_fin) {
        this.datefin = date_fin;
    }


    @Override
    public String toString() {
        return "EnseignantFiliere{" +
                "ID=" + ID +
                ", datedebut=" + datedebut +
                ", date_fin=" + datefin +
                '}';
    }
}
