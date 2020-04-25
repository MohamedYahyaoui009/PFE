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
    private  Date date_debut;

    @Temporal(TemporalType.DATE)
    private Date date_fin;


    public HistoriqueEnseignantFiliere() {
    }


    public EnseignantFilierePK getID() {
        return ID;
    }

    public void setID(EnseignantFilierePK ID) {
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
        return "EnseignantFiliere{" +
                "ID=" + ID +
                ", date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                '}';
    }
}
