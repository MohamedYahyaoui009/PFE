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
    private Date date_debut;

    @Temporal(TemporalType.DATE)
    private Date date_fin;


    public HistoriqueEtudiantModule() {
    }

    public EtudiantModulePK getID() {
        return ID;
    }

    public void setID(EtudiantModulePK ID) {
        this.ID = ID;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return "EtudiantModule{" +
                "ID=" + ID +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                '}';
    }
}
