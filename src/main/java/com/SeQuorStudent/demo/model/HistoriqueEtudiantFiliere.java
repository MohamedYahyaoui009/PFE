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
    private Date date_debut;

    @Temporal(TemporalType.DATE)
    private Date date_fin;

    public HistoriqueEtudiantFiliere() {
    }

    public EtudiantFilierePK getID() {
        return ID;
    }

    public void setID(EtudiantFilierePK ID) {
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
        return "EtudiantFiliere{" +
                "ID=" + ID +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                '}';
    }
}
