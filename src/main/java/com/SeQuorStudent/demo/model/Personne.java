package com.SeQuorStudent.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)
@DiscriminatorValue("personne")
@Table(name = "personne")
public class Personne implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nom ;
    private String prenom ;
    private String email ;
    private String cin ;
    private String login ;
    private String password ;

    @Enumerated(EnumType.STRING)
    private TypePersonne Role;

    @Temporal(TemporalType.DATE)
    private Date datenaissance ;

    private int tel;

    public Personne() {
    }

    public Personne(long id, String nom, String prenom, String email, String cin, String login, String password, TypePersonne role, Date datenaissance, int tel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.cin = cin;
        this.login = login;
        this.password = password;
        Role = role;
        this.datenaissance = datenaissance;
        this.tel = tel;
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

    public TypePersonne getRole() {
        return Role;
    }

    public void setRole(TypePersonne role) {
        Role = role;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", cin='" + cin + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", Role=" + Role +
                ", datenaissance=" + datenaissance +
                ", tel=" + tel +
                '}';
    }
}
