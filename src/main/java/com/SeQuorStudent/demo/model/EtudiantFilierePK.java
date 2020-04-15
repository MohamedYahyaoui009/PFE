package com.SeQuorStudent.demo.model;

public class EtudiantFilierePK
{

    private long id_etudiant;

    private long id_filiere;


    public EtudiantFilierePK() {
    }

    public long getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(long id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public long getId_filiere() {
        return id_filiere;
    }

    public void setId_filiere(long id_filiere) {
        this.id_filiere = id_filiere;
    }


    @Override
    public String toString() {
        return "EtudiantFilierePK{" +
                "id_etudiant=" + id_etudiant +
                ", id_filiere=" + id_filiere +
                '}';
    }
}
