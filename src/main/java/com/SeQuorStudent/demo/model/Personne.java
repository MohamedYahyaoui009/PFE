package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Date;

public class Personne
{
    private String nom ;
    private String prenom ;
    private Date datenaissance ;
    private String email ;
    private String cin ;
    private String login ;
    private String password ;
    private long id ;
    private int tel;

    public Personne(String nom, String prenom, Date datenaissance, String email, String cin, String login, String password, long id, int tel)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.datenaissance=datenaissance;
        this.email=email;
        this.cin=cin;
        this.login=login;
        this.password=password;
        this.id=id;
        this.tel=tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", datenaissance=" + datenaissance +
                ", email='" + email + '\'' +
                ", cin='" + cin + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", tel=" + tel +
                '}';
    }
}
