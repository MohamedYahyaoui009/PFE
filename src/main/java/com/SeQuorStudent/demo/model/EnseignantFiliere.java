package com.SeQuorStudent.demo.model;


import javax.persistence.*;

@Entity
@DiscriminatorValue("enseignantfiliere")
@Table(name = "enseignantfiliere")
public class EnseignantFiliere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private EnseignantFilierePK ID;


    private  Date date_debut;

    private Date date_fin;


    public EnseignantFiliere() {
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
