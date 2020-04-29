package com.SeQuorStudent.demo.model;


import javax.persistence.*;
import java.util.*;

@Entity
@DiscriminatorValue("historiqueenseignantmodule")
@Table(name = "historiqueenseignantmodule")
public class HistoriqueEnseignantModule {

    @EmbeddedId
    private  EnseignantModulePK ID;

    @Temporal(TemporalType.DATE)
    private Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;

    public HistoriqueEnseignantModule() {
    }


    public EnseignantModulePK getID() {
        return ID;
    }

    public void setID(EnseignantModulePK ID) {
        this.ID = ID;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date date_debut) {
        this.datedebut = date_debut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDate_fin(Date date_fin) {
        this.datefin = date_fin;
    }

    @Override
    public String toString() {
        return "EnseignantModule{" +
                "ID=" + ID +
                ", datedebut=" + datedebut +
                ", datefin=" + datefin +
                '}';
    }
}
